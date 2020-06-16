package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends DiscountStrategy {
    @Override
    public int discount(int price, User user) {
        if (user.isVip()) {
            price *= 0.95;
        }
        return price;
    }

}