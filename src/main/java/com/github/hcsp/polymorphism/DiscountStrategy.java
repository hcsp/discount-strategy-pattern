package com.github.hcsp.polymorphism;

public class DiscountStrategy extends PriceCalculator {
    public int discount(int price, User user) {
        throw new UnsupportedOperationException();
    }
}
