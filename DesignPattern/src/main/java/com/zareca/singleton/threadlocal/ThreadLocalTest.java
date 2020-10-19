package com.zareca.singleton.threadlocal;

/**
 * @Auther: ly
 * @Date: 2020/10/13 14:23
 * @Description:
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println(instance);
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread thread0 = new Thread(new ThreadLocalExcutorThread());
        Thread thread1 = new Thread(new ThreadLocalExcutorThread());
        thread0.start();
        thread1.start();
    }
}