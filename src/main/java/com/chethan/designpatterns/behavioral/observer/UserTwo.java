package com.chethan.designpatterns.behavioral.observer;

public class UserTwo implements SocialMediaUser{
    @Override
    public void update(Message m) {
        System.out.println("In UserTwo: " + m);
    }
}
