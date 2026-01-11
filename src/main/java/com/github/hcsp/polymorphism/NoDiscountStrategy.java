package com.github.hcsp.polymorphism;


public class NoDiscountStrategy extends DiscountStrategy {
    @Override
    public int discount(int price, User user) {
        return price;
    }

}
