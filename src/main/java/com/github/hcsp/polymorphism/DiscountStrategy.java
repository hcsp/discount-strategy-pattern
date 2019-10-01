package com.github.hcsp.polymorphism;

public abstract class DiscountStrategy {
    public int discount(int price, User user) {
        throw new UnsupportedOperationException();
    }
}
