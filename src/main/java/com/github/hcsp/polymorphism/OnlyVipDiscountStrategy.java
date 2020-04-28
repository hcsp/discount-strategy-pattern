package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends DiscountStrategy {
    @Override
    public int discount(int price, User user) {
        if (user.isVip()) {
            return (95 * price) / 100;
        }else {
            return price;
        }
    }
}
