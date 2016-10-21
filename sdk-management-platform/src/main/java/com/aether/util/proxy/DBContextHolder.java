package com.aether.util.proxy;

/**
 * 类说明 支持 动态数据源dynamicDataSource中的dataSourceKeyRW、dataSourceKeyR就是 protected
 * abstract Object determineCurrentLookupKey();
 * 这个方法要返回的值。那么如何设置，让这个方法的返回值是根据我们的需要返回dataSourceKeyRW、dataSourceKeyR呢？
 * 由于这个方法没有入参，并且是spring自动调用的，因此考虑使用静态变量存储dataSource的key，在调用sql语句前设置静态变量的值，
 * 然后在这个方法中得到静态变量的值，返回。又考虑到多线程，同时可能会有很多请求，为避免线程之间相互干扰，考虑使用threadLocal。
 * 下面就是存储dataSourceKey的容器类。
 * 
 * @author liuyang 　* @date 创建时间：2016年10月10日 下午4:25:52
 *
 */
public class DBContextHolder {

    // 使用ThreadLocal记录当前线程的数据源key
    private static ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    // 写库对应的数据源key
    public static final String DB_TYPE_RW = "dataSourceKeyRW";
    // 读库对应的数据源key
    public static final String DB_TYPE_R = "dataSourceKeyR";

    public static String getDbType() {
        String db = contextHolder.get();
        if (db == null) {
            db = DB_TYPE_RW;// 默认是读写库
        }
        return db;
    }

    /**
     * 
     * 设置本线程的dbtype
     * 
     * @param str
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    public static void setDbType(String str) {
        contextHolder.set(str);
    }

    /**
     * clearDBType
     * 
     * @Title: clearDBType
     * @Description: 清理连接类型
     */
    public static void clearDBType() {
        contextHolder.remove();
    }

    public static boolean isMaster() {
        return DB_TYPE_RW.equals(getDbType());
    }
}
