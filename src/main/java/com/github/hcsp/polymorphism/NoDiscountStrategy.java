package com.github.hcsp.polymorphism;

/**
 * @author Kelvin Chen
 */
public class NoDiscountStrategy implements DiscountStrategy {

    @Override
    public int discount(int price, User user) {
        return price;
    }
}
