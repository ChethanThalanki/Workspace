package com.chethan.designpatterns.behavioral.observer;

public class UserOne implements SocialMediaUser{
    @Override
    public void update(Message m) {
        System.out.println("In UserOne: "+m);
    }
}
