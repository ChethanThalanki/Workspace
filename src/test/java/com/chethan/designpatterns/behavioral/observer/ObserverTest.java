package com.chethan.designpatterns.behavioral.observer;

import org.junit.jupiter.api.Test;

public class ObserverTest {
    @Test
    void followersTest(){
        UpdatePublisher updatePublisher = new UpdatePublisher();
        UserTwo userTwo = new UserTwo();
        updatePublisher.attach(new UserOne());
        updatePublisher.attach(userTwo);

        updatePublisher.notifyAll(new Message("Update 1"));
        updatePublisher.detach(userTwo);
        updatePublisher.notifyAll(new Message("Update 2"));
    }
}
