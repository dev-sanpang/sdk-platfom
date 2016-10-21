package com.aether.util.proxy;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.util.ReflectionUtils;

/**
 * 类说明 支持 多数据源的动态配置以及读写分离的策略
 * @author liuyang
　* @date 创建时间：2016年10月10日 下午4:26:45
 *
 */
public class DynamicDataSourceHolder extends AbstractRoutingDataSource {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(DynamicDataSourceHolder.class);

    // 从库的总数
    private Integer slaveCount;

    // 轮询计数,初始为-1,AtomicInteger是线程安全的
    private AtomicInteger counter = new AtomicInteger(-1);

    // 记录读库的key
    private List<Object> slaveDataSources = new ArrayList<Object>(0);

    /**
     * 核心的API 根据key 决定选择哪个数据库
     */
    @Override
    protected Object determineCurrentLookupKey() {
        System.out.println(DBContextHolder.getDbType());
        // 返回key 决定走哪个数据源
        // 如果是写操作 写操作 就走写库
        if (DBContextHolder.isMaster()) {
            Object key = DBContextHolder.getDbType();
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("当前DataSource的key为mas:{}" + key);
            }
            return DBContextHolder.getDbType();
        }
        Object key = getSlaveKey();
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("当前DataSource的key为:{}" + key);
        }
        return key;

    }

    @SuppressWarnings("unchecked")
    @Override
    public void afterPropertiesSet() {
        super.afterPropertiesSet();
        // 由于父类的resolvedDataSources属性是私有的子类获取不到，需要使用反射获取
        Field field = ReflectionUtils.findField(
                AbstractRoutingDataSource.class, "resolvedDataSources");
        field.setAccessible(true); // 设置可访问

        try {
            Map<Object, DataSource> resolvedDataSources = (Map<Object, DataSource>) field
                    .get(this);
            // 读库的数据量等于数据源总数 包括写库的数量
            this.slaveCount = resolvedDataSources.size() - 1;
            for (Map.Entry<Object, DataSource> entry : resolvedDataSources
                    .entrySet()) {
                // 读写分离 一般都是写的操作只能放在写库里面 但是读库 随机的 英文 读的业务场景 远远多于 写的业务场景
                if (DBContextHolder.DB_TYPE_RW.equals(entry.getKey())) {
                    // 跳出本次 ，但继续循环执行
                    continue;
                }
                LOGGER.debug(slaveCount + "加入读库:{} " + entry.getKey());
                slaveDataSources.add(entry.getKey());
            }
        } catch (Exception e) {
            LOGGER.error("afterPropertiesSet error! ", e);
        }
    }

    /**
     * 轮询算法实现
     * 
     * @return
     */
    public Object getSlaveKey() {
        // 得到的下标为：0、1、2、3……
        Integer index = counter.incrementAndGet() % slaveCount;
        if (counter.get() > 9999) { // 以免超出Integer范围
            counter.set(-1); // 还原
        }
        return slaveDataSources.get(index);
    }

}
