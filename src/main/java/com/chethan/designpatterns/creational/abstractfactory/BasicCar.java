package com.chethan.designpatterns.creational.abstractfactory;

public abstract class BasicCar {
    private Type type;
    private Location location;

    public BasicCar(Location location, Type type) {
        this.type = type;
        this.location = location;
        assemble();
    }

    private void assemble() {
        System.out.printf("Assembling car of type %s in %s \n", type, location);
        construct();
    }

    protected abstract void construct();
}
