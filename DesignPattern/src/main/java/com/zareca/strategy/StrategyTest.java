package com.zareca.strategy;

/**
 * @Auther: ly
 * @Date: 2020/10/18 21:19
 * @Description:
 */
public class StrategyTest {
    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//        String promotionKey = "COUPON";
//
//        if (StringUtils.equals(promotionKey, "COUPON")) {
//            promotionActivity = new PromotionActivity(new CouponStrategy());
//        } else if (StringUtils.equals(promotionKey, "CASHBACK")) {
//            promotionActivity = new PromotionActivity(new CashbackStrategy());
//        } else {
//            promotionActivity = new PromotionActivity(new EmptyStrategy());
//        }
//
//        promotionActivity.execute();

        // 上面方式比较复杂，结合单例模式和工厂模式进行优化
        String promotionKey = "COUPON";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }
}
