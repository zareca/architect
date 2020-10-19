package com.zareca.decorator;

/**
 * @Auther: ly
 * @Date: 2020/10/19 22:27
 * @Description:
 */
public class SausageDecorator extends BattercakeDecorator {
    @Override
    public void doSomething() {

    }

    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
