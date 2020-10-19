package com.zareca.decorator;

/**
 * @Auther: ly
 * @Date: 2020/10/19 22:28
 * @Description:
 */
public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake = null;
        BaseBattercake baseBattercake = new BaseBattercake();
        battercake = new EggDecorator(baseBattercake);
        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getMsg()+","+battercake.getPrice());
    }
}
