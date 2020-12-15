package com.chethan.designpatterns.creational.factory;

//java.sql.DriverManager#getConnection(), java.net.URL#openConnection(), java.lang.Class#newInstance()
public class CarFactory {
    public static BasicCar getCar(CarType type){
        BasicCar car;
        switch (type) {
            case HATCHBACK: car = new HatchbackCar(); break;
            case SEDAN: car = new SedanCar(); break;
            default: car = new HatchbackCar();
        }
        return car;
    }
}
