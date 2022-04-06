package com.github.hcsp.polymorphism;

public class NoDiscountStrategy extends DiscountStrategy {
    public int discount(int price, User user) {
        return price;
    }
}
