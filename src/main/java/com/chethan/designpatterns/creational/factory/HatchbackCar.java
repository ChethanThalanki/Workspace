package com.chethan.designpatterns.creational.factory;

public class HatchbackCar extends BasicCar{

    public HatchbackCar() {
        super(CarType.HATCHBACK);
    }

    @Override
    protected void construct() {
        System.out.printf("Constructing %s \n", HatchbackCar.class.getSimpleName());
    }
}
