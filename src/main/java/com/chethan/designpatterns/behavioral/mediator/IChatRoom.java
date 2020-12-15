package com.chethan.designpatterns.behavioral.mediator;

public interface IChatRoom {
    void sendMessage(String msg, int userId);
    void addUser(User user);
}
