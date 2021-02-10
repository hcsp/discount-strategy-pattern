package com.github.hcsp.polymorphism;

public class NoDiscountStrategy extends DiscountStrategy{

    @Override
    public int discount(DiscountStrategy strategy, int price, User user){
        return price;
    };

}
