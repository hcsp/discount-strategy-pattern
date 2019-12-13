package com.github.hcsp.polymorphism;

public class NoDiscountStrategy extends DiscountStrategy {
	
	 public static int discount(int price, User user) {
			return price;
	    }
}
