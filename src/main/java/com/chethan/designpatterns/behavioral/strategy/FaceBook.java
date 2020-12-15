package com.chethan.designpatterns.behavioral.strategy;

public class FaceBook implements SocialMediaStrategy{
    @Override
    public void connectTo(String friend) {
        System.out.printf("Connecting to %s using Facebook \n", friend);
    }
}
