package com.chethan.designpatterns.structural.flyweight;

public class Customer {
    private String name;
    private int age;
    private CustomerLevel membershipLevel;

    public Customer(String name, int age, CustomerLevel membershipLevel) {
        this.name = name;
        this.age = age;
        this.membershipLevel = membershipLevel;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public CustomerLevel getMembershipLevel() {
        return membershipLevel;
    }
}
