package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends Strategy {
    @Override
    public int getPrice(int price, User user) {
        if (user.isVip()) {
            return (int) (price * 0.95);
        } else {
            return super.getPrice(price, user);
        }

    }
}
