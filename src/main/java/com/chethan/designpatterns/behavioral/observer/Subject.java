package com.chethan.designpatterns.behavioral.observer;

public interface Subject {
    void attach(SocialMediaUser o);
    void detach(SocialMediaUser o);
    void notifyAll(Message m);
}
