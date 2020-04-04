package com.github.hcsp.polymorphism;

public class Discount95Strategy {
    public int discount(int price, User user) {
        return (int) (price * 0.95);
    }
}
