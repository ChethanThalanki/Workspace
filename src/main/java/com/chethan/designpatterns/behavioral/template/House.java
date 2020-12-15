package com.chethan.designpatterns.behavioral.template;

public abstract class House {
    public final void buildHouse(){
        buildBase();
        buildRoof();
        buildWalls();
    }

    private void buildBase() {
        System.out.println("Building base of the house");
    }

    private void buildRoof(){
        System.out.println("Building roof of the house");
    }

    protected abstract void buildWalls();
}
