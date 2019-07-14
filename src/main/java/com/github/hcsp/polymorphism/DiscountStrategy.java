package com.github.hcsp.polymorphism;

public abstract class DiscountStrategy {
//    顶级策略父类 强制要求子类实现discount方法去计算折扣
    abstract int discount(int price, User user);
}
