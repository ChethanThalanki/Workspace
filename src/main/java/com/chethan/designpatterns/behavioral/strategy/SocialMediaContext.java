package com.chethan.designpatterns.behavioral.strategy;

public class SocialMediaContext {
    private SocialMediaStrategy strategy;

    public void setStrategy(SocialMediaStrategy strategy) {
        this.strategy = strategy;
    }

    public void connect(String friend){
        strategy.connectTo(friend);
    }
}
