package com.zareca.strategy;

/**
 * @Auther: ly
 * @Date: 2020/10/18 21:14
 * @Description:
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;


    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute() {
        promotionStrategy.doPromition();
    }
}
