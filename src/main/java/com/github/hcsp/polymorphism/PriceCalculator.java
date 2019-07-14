package com.github.hcsp.polymorphism;

public class PriceCalculator {
     public static int calculatePrice(DiscountStrategy strategy, int price, User user) {
//         现在只需要直接调用strategy.discount(price, user);即可，就算之后有其他策略，新建一个DiscountStrategy的子类即可，无需修改此处代码
         return strategy.discount(price, user);
     }
}
