package com.zareca.singleton.register;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: ly
 * @Date: 2020/10/13 11:05
 * @Description:
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static ConcurrentHashMap ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className) throws Exception {
        if (!ioc.containsKey(className)) {
            synchronized (ioc) {
                if (!ioc.containsKey(className)) {
                    Object obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                    return obj;
                }

                return ioc.get(className);
            }
        }
        return ioc.get(className);
    }


}
