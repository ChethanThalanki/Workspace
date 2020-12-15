package com.chethan.designpatterns.creational.factory;

public abstract class BasicCar {
    private CarType type;

    public BasicCar(CarType type) {
        this.type = type;
        assemble();
    }

    private void assemble() {
        System.out.printf("Assembling car of type %s \n", type);
        construct();
    }

    protected abstract void construct();
}
