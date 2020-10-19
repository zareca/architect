package com.zareca.singleton.register;

/**
 * @Auther: ly
 * @Date: 2020/10/13 11:14
 * @Description:
 */
public class ContainerTest {

    public static void main(String[] args) {
        Thread thread0 = new Thread(new ContainerExcutorThread());
        Thread thread1 = new Thread(new ContainerExcutorThread());
        thread0.start();
        thread1.start();

    }
}
