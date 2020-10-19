package com.zareca.singleton.lazy;

/**
 * @Auther: ly
 * @Date: 2020/10/12 22:56
 * @Description:
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        Thread thread0 = new Thread(new ExcutorThread());
        Thread thread1 = new Thread(new ExcutorThread());
        thread0.start();
        thread1.start();
    }

}
