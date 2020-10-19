package com.zareca.strategy;

/**
 * @Auther: ly
 * @Date: 2020/10/18 21:13
 * @Description:
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromition() {
        System.out.println("返现促销");
    }
}
