package com.github.hcsp.polymorphism;

public class Discount95Strategy extends DiscountStrategy {
    @Override
    public int discount(int price, User user) {
        return (int) (price * 0.95);
    }
}
