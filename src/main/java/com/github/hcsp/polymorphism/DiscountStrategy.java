package com.github.hcsp.polymorphism;

public abstract class DiscountStrategy {
    public abstract int discount(int price, User user);
}
