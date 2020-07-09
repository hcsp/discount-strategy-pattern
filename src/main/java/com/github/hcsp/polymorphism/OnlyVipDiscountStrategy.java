package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends DiscountStrategy{
    public int discount(int price, User user) {
        if (user.isVip()) {
            return price * 95 / 100;
        } else {
            return price;
        }
    }
}
