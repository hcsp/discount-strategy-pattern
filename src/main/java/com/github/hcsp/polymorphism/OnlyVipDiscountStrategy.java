package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends PriceCalculator {
    @Override
    public int discount(int price,User user){
        if(user.isVip()){
            return (int) (price*0.95);
        }else{
            return price;
        }
    }

}
