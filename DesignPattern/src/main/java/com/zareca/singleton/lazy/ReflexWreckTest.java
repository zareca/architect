package com.zareca.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * @Auther: ly
 * @Date: 2020/10/12 23:25
 * @Description:
 */
public class ReflexWreckTest {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = LazyInnerClassSingleton.class;
        Constructor c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        Object o = c.newInstance();
        LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
        System.out.println(o == instance);




    }

}
