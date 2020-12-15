package com.chethan.designpatterns.creational.abstractfactory;


public class APJCarFactory {
    public static BasicCar buildCar(Type type) {
        BasicCar car;
        Location location = Location.APJ;
        switch (type) {
            case HATCHBACK: car = new HatchbackCar(location); break;
            case SEDAN: car = new SedanCar(location); break;
            default: car = new HatchbackCar(location);
        }
        return car;
    }
}
