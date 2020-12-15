package com.chethan.designpatterns.creational.abstractfactory;

public class SedanCar extends BasicCar {

    public SedanCar(Location location) {
        super(location, Type.SEDAN);
    }

    @Override
    protected void construct() {
        System.out.printf("Constructing %s \n", SedanCar.class.getSimpleName());
    }
}
