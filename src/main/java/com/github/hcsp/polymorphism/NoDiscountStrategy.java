package com.github.hcsp.polymorphism;

public class NoDiscountStrategy extends DiscountStrategy{
    public static final double discount = 1;
    @Override
    public int discount(int price, User user) {
        return (int) (price * discount);
    }
}
