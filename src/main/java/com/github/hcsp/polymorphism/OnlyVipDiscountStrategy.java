package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy implements DiscountStrategy{

    @Override
    public int discount(int price, User user) {
        if (user.isVip()) {
            return (int) (price * 0.95);
        }
        return price;
    }
}
