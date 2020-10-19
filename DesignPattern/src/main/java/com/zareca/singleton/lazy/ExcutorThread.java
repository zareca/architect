package com.zareca.singleton.lazy;

/**
 * @Auther: ly
 * @Date: 2020/10/12 22:54
 * @Description:
 */
public class ExcutorThread implements Runnable {
    public void run() {

        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);


    }
}
