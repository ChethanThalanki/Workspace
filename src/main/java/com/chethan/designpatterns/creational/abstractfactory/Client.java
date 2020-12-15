package com.chethan.designpatterns.creational.abstractfactory;


public class Client {
    public static void main(String[] args) {
        System.out.println(InternationalCarFactory.buildCar(Location.APJ, Type.HATCHBACK));
        System.out.println(InternationalCarFactory.buildCar(Location.EMEA, Type.HATCHBACK));
        System.out.println(InternationalCarFactory.buildCar(Location.APJ, Type.SEDAN));
    }
}
