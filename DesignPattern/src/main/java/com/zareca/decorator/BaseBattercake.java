package com.zareca.decorator;

/**
 * @Auther: ly
 * @Date: 2020/10/19 22:21
 * @Description:
 */
public class BaseBattercake extends Battercake {

    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
