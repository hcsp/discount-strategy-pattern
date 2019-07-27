package com.github.hcsp.polymorphism;

public interface DiscountStrategy {
    int discount(int price, User user);
}
