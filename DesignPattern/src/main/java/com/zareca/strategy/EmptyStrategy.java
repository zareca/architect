package com.zareca.strategy;

/**
 * @Auther: ly
 * @Date: 2020/10/18 21:14
 * @Description:
 */
public class EmptyStrategy implements PromotionStrategy {

    @Override
    public void doPromition() {
        System.out.println("无促销");
    }
}
