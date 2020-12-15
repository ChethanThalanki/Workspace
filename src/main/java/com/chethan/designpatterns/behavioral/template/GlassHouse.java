package com.chethan.designpatterns.behavioral.template;

public class GlassHouse extends House{
    @Override
    protected void buildWalls() {
        System.out.println("Building glass walls");
    }
}
