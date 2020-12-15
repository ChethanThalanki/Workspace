package com.chethan.designpatterns.creational.abstractfactory;

// DocumentBuilderFactory#newInstance()

public class InternationalCarFactory {
    public static BasicCar buildCar(Location location, Type type){

        switch (location){
            case APJ: return APJCarFactory.buildCar(type);
            case EMEA: return EMEACarFactory.buildCar(type);
            default: return APJCarFactory.buildCar(type);
        }
    }
}
