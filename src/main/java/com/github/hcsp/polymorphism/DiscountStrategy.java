package com.github.hcsp.polymorphism;

public class DiscountStrategy extends AbstractStrategy{

    @Override
    public int calculatePrice(int price, User user) {
        throw new UnsupportedOperationException();
    }
}
