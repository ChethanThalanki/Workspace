package com.chethan.designpatterns.structural.flyweight;

public class DiscountUtil {

    public static float priceAfterDiscount(Customer customer, float amount){
        return (100 - customer.getMembershipLevel().getDiscountPercentage()) * (amount / 100);
    }
}
