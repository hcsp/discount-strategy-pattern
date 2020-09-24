package com.github.hcsp.polymorphism;

public class NoDiscountStrategy extends Strategy{
    @Override
    public int getPrice(int price, User user) {
        return super.getPrice(price, user);
    }
}
