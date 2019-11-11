package com.github.hcsp.polymorphism;

/**
 * @author Kelvin Chen
 */
public class Discount95Strategy implements DiscountStrategy{
    @Override
    public int discount(int price, User user) {
        return (int) (price * 0.95);
    }
}
