package com.github.hcsp.polymorphism;

/**
 * @author Kelvin Chen
 */
public interface DiscountStrategy {
    /**
     * 根据用户属性判断价格
     *
     * @param price 原价
     * @param user 购买用户
     * @return 实际购买价格
     */
    default int discount(int price, User user){
        throw new IllegalStateException("Should not be here!");
    }
}
