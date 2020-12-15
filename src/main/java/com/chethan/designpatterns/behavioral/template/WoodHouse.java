package com.chethan.designpatterns.behavioral.template;

public class WoodHouse extends House{
    @Override
    protected void buildWalls() {
        System.out.println("Building wooden walls");
    }
}
