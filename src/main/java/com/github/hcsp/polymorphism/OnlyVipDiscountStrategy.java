package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends DiscountStrategy {
    @Override
    public int discount(int price, User user) {
        return user.isVip() ? 95:100;
    }
}
