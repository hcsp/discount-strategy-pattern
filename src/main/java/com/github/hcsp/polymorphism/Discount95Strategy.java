package com.github.hcsp.polymorphism;

public class Discount95Strategy extends Strategy{
    @Override
    public int getPrice(int price, User user) {
        return (int) (price*0.95);
    }
}
