package com.github.hcsp.polymorphism;

public class Discount95Strategy extends AbstractStrategy {

    @Override
    public int calculatePrice(int price, User user) {
        return (int) (price * 0.95);
    }

}
