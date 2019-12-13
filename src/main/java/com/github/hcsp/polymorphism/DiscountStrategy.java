package com.github.hcsp.polymorphism;

public abstract class DiscountStrategy {
	
    public static int discount(int price, User user) {
		return price;
    }
}
