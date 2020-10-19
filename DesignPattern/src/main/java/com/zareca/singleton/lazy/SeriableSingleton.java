package com.zareca.singleton.lazy;

import java.io.Serializable;

/**
 * @Auther: ly
 * @Date: 2020/10/12 23:52
 * @Description:
 */
public class SeriableSingleton implements Serializable {

    private static final SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }

    // 添加该方法即可避免反序列化破坏单例
    private Object readResolve() {
        return INSTANCE;
    }
}
