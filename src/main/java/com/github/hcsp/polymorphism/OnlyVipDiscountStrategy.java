package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends DiscountStrategy{
    @Override
    public int discount(int price,User user){
       if(user.isVIP()){
           return (int)(price*0.95);
                  }else {
           return price;
       }
       }
    }

