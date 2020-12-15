package com.chethan.designpatterns.creational.factory;

public class SedanCar extends BasicCar{

    public SedanCar() {
        super(CarType.SEDAN);
    }

    @Override
    protected void construct() {
        System.out.printf("Constructing %s \n", SedanCar.class.getSimpleName());
    }
}
