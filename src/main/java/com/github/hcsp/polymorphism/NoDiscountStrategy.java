package com.github.hcsp.polymorphism;

public class NoDiscountStrategy extends Discount95Strategy {
    @Override
    public int discount(int price, User user) {
        return price;
    }
}
