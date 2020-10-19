package com.zareca.proxy.staticproxy;

/**
 * @Auther: ly
 * @Date: 2020/10/15 14:54
 * @Description:
 */
public class DataSource {

    private static final ThreadLocal threadLocal = new ThreadLocal<String>();

    private DataSource() {
    }

    public static Object get() {
        return threadLocal.get();
    }

    public static void set(String dataSource) {
        threadLocal.set(dataSource);
    }

    public static void set(int year) {
        threadLocal.set("DB_" + year);
    }

    public static void restore() {
        threadLocal.set(null);
    }

}
