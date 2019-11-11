package com.github.hcsp.polymorphism;

/**
 * @author Kelvin Chen
 */
public class OnlyVipDiscountStrategy implements DiscountStrategy {
    @Override
    public int discount(int price, User user) {
        return user.isVip() ? (int) (price * 0.95) : price;
    }
}
