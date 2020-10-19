package com.zareca.singleton.register;


/**
 * @Auther: ly
 * @Date: 2020/10/12 22:54
 * @Description:
 */
public class ContainerExcutorThread implements Runnable {
    public void run() {

        try {
            Seal seal = (Seal) ContainerSingleton.getBean("com.zareca.singleton.register.Seal");
            System.out.println(Thread.currentThread().getName() + ":" + seal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
