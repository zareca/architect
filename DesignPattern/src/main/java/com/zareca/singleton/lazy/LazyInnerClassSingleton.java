package com.zareca.singleton.lazy;

/**
 * @Auther: ly
 * @Date: 2020/10/12 23:13
 * @Description:
 */
public class LazyInnerClassSingleton {


    private LazyInnerClassSingleton() {
        if (InnerClass.LAZYSINGLETON != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {
        return InnerClass.LAZYSINGLETON;
    }


    private static class InnerClass {

        private static final LazyInnerClassSingleton LAZYSINGLETON = new LazyInnerClassSingleton();


    }


}
