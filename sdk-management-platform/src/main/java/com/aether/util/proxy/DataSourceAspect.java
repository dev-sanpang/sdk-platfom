package com.aether.util.proxy;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Value;

/**
 * 
 * @author liuyang 　* @date 创建时间：2016年10月10日 下午4:23:50
 *
 */
public class DataSourceAspect {

    // sql 走读库的关键字 通过spring注入 conifg.properties 配置 一定要有setter
    @Value("${datasource.readdatakey}")
    private String readKey;
    // sql 走写库的关键字 通过spring注入 conifg.properties 配置 一定要有setter
    @Value("${datasource.writedatakey}")
    private String writeKey;

    private static Logger LOGGER = Logger.getLogger(DataSourceAspect.class);

    public void before(JoinPoint point) {
        Object target = point.getTarget();
        String method = point.getSignature().getName();
        Class<?>[] classz = target.getClass().getInterfaces();
        Class<?>[] parameterTypes = ((MethodSignature) point.getSignature())
                .getMethod().getParameterTypes();
        try {
            Method m = classz[0].getMethod(method, parameterTypes);
            if (m != null ) {
                LOGGER.info("调用的方法是:" + m.getName() + "传入的数据源为");
                if (isReadSqlStatement(m)) {
                    // 多数据源的时候 就可以分配策略了
                    DBContextHolder.setDbType("dataSourceKeyR");
                } else if (isWriteSqlStatement(m)) {
                    DBContextHolder.setDbType("dataSourceKeyRW");
                } else {
                    DBContextHolder.setDbType("dataSourceKeyRW");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 根据 方法名称 判断是不是写操作的语句块
    private boolean isWriteSqlStatement(Method m) {
        String mname = m.getName();

        String castMethod[] = writeKey.split(",");
        for (String va : castMethod) {
            if (mname.startsWith("" + va) && !"".equals(va)) {
                LOGGER.info("Y匹配写操作数据源关键字：>>>>" + va);
                System.out.println("Y匹配写操作数据源关键字：>>>>" + va);
                return true;
            }
        }
        return false;
    }

    // 根据 方法名称 判断是不是读操作的语句块
    private boolean isReadSqlStatement(Method m) {
        String mname = m.getName();
        String castMethod[] = readKey.split(",");
        for (String va : castMethod) {
            LOGGER.info("No匹配读操作数据源关键字：{}"+va);
            if (mname.startsWith("" + va) && !"".equals(va)) {
                LOGGER.info("Y匹配读操作数据源关键字{}" + va);
                return true;
            }
        }
        return false;
    }
}
