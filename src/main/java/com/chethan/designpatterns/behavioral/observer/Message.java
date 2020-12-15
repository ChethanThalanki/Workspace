package com.chethan.designpatterns.behavioral.observer;

public class Message {
    private String messageContent;

    public Message(String messageContent) {
        this.messageContent = messageContent;
    }

    @Override
    public String toString() {
        return messageContent;
    }
}
