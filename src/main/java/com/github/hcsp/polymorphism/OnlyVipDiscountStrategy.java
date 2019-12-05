package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends AbstractStrategy {

    @Override
    public int calculatePrice(int price, User user) {
        int resultPrice = price;
        if (user.isVip()) {
            resultPrice = (int)(resultPrice * 0.95);
        }
        return resultPrice;
    }
}
