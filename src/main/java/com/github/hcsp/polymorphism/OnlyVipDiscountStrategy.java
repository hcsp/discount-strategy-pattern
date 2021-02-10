package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends DiscountStrategy {
    @Override
    public int discount(DiscountStrategy strategy, int price, User user) {
        if (user.isVip()) {
            return (int) (price * 0.95);
        } else {
            return price;
        }
    }
}
