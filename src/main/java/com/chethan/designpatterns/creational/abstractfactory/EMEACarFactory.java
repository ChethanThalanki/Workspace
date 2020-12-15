package com.chethan.designpatterns.creational.abstractfactory;

public class EMEACarFactory {

    public static final Location location = Location.EMEA;

    public static BasicCar buildCar(Type type) {
        BasicCar car;
        switch (type) {
            case HATCHBACK: car = new HatchbackCar(location); break;
            case SEDAN: car = new SedanCar(location); break;
            default: car = new HatchbackCar(location);
        }
        return car;
    }
}
