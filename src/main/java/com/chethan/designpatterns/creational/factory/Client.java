package com.chethan.designpatterns.creational.factory;

public class Client {
    public static void main(String[] args) {
        System.out.println(CarFactory.getCar(CarType.HATCHBACK));
        System.out.println(CarFactory.getCar(CarType.SEDAN));
    }
}
