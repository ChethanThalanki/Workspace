package com.chethan.designpatterns.behavioral.strategy;

public class Instagram implements SocialMediaStrategy{
    @Override
    public void connectTo(String friend) {
        System.out.printf("Connecting to %s using Instagram \n", friend);
    }
}

