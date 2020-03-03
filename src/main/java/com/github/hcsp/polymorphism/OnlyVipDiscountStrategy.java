package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends DiscountStrategy{
    public static final double discount = 0.95;
    @Override
    public int discount(int price, User user) {
        if (user.isVip()){
            return (int) (price * discount);
        }else {
            return price;
        }
    }

}
