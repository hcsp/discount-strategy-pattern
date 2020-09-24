package com.github.hcsp.polymorphism;

public class DiscountStrategy extends Strategy{
    public int discount(int price, User user) {
        throw new UnsupportedOperationException();
    }
}
