package com.github.hcsp.polymorphism;

public class NoDiscountStrategy extends PriceCalculator {
    @Override
    public int discount(int price, User user) {
        return price;
    }

}
