package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends DiscountStrategy {

    @Override
    public int discount(int price, User user) {
        if(user.isVip()) {
            return (int) (price * .95);
        } else {
            return price;
        }
    }
}
