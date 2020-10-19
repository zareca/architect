package com.zareca.singleton.threadlocal;


import com.zareca.singleton.register.ContainerSingleton;
import com.zareca.singleton.register.Seal;

/**
 * @Auther: ly
 * @Date: 2020/10/12 22:54
 * @Description:
 */
public class ThreadLocalExcutorThread implements Runnable {
    public void run() {

        try {
            ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance);
            ThreadLocalSingleton instance1 = ThreadLocalSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance1);
            ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
