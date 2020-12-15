package com.chethan.designpatterns.creational.abstractfactory;


public class HatchbackCar extends BasicCar {

    public HatchbackCar(Location location) {
        super(location, Type.HATCHBACK);
    }

    @Override
    protected void construct() {
        System.out.printf("Constructing %s \n", HatchbackCar.class.getSimpleName());
    }
}
