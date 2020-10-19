package com.zareca.singleton.hungry;

/**
 * @Auther: ly
 * @Date: 2020/10/12 22:47
 * @Description:
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static  HungrySingleton getInstance(){
        return  hungrySingleton;
    }
}
