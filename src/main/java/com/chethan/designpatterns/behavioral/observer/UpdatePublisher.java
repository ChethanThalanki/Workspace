package com.chethan.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class UpdatePublisher implements Subject{
    private List<SocialMediaUser> followers = new ArrayList<>();

    @Override
    public void attach(SocialMediaUser o) {
        followers.add(o);
    }

    @Override
    public void detach(SocialMediaUser o) {
        followers.remove(o);
    }

    @Override
    public void notifyAll(Message m) {
        followers.forEach(f -> f.update(m));
    }
}
