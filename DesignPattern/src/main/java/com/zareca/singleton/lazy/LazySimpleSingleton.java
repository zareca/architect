package com.zareca.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * @Auther: ly
 * @Date: 2020/10/12 22:50
 * @Description:
 */
public class LazySimpleSingleton {

    private volatile static LazySimpleSingleton lazySingleton = null;

    private LazySimpleSingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazySimpleSingleton getInstance() {
        if (null == lazySingleton) {
            synchronized (LazySimpleSingleton.class) {
                if (null == lazySingleton) {
                    lazySingleton = new LazySimpleSingleton();
                }
            }
        }
        return lazySingleton;
    }


    public static void main(String[] args) throws Exception {

        // 这种情况无法解反序列化破坏问题，因为反射构造实例化没有将实例传给lazySingleton
        Class<?> clazz = LazySimpleSingleton.class;
        Constructor c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        Object o = c.newInstance();

        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
    }

}
