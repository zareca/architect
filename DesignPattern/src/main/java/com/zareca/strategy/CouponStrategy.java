package com.zareca.strategy;

/**
 * @Auther: ly
 * @Date: 2020/10/18 21:12
 * @Description:
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromition() {
        System.out.println("优惠券促销");
    }
}
