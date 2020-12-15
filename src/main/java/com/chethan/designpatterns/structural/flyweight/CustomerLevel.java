package com.chethan.designpatterns.structural.flyweight;

public enum CustomerLevel {
    BRONZE(5), SILVER(10), GOLD(15), PLATINUM(20);

    private int discountPercentage;

    CustomerLevel(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }
}
