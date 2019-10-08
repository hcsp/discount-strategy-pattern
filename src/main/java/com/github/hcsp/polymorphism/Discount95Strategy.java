package com.github.hcsp.polymorphism;

import java.math.BigDecimal;

public class Discount95Strategy extends DiscountStrategy{
    @Override
    public int discount(int price, User user) {
        return (int) (price*0.95);
    }
}
