package com.zareca.singleton.register;

import java.lang.reflect.Constructor;

/**
 * @Auther: ly
 * @Date: 2020/10/13 10:49
 * @Description:
 */
public class EnumTest {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = EnumSingleton.class;
        // 枚举只有该一个构造方法
        Constructor<?> c = clazz.getDeclaredConstructor(String.class, int.class);
        c.setAccessible(true);
        EnumSingleton o = (EnumSingleton) c.newInstance("Zereca", 111);
        System.out.println(o);
    }
}
