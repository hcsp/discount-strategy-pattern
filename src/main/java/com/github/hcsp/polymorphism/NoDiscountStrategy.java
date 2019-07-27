package com.github.hcsp.polymorphism;

public class NoDiscountStrategy implements DiscountStrategy {

    @Override
    public int discount(int price, User user) {
        return price;
    }
}
