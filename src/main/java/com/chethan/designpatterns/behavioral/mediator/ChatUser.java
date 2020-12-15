package com.chethan.designpatterns.behavioral.mediator;

public class ChatUser extends User{
    public ChatUser(int id, String name, IChatRoom chatRoom) {
        super(id, name, chatRoom);
    }

    @Override
    public void send(String message, int userId) {
        System.out.printf("Sending Message:'%s' from user:%s to user:%s \n", message, this.getId(), userId);
        getMediator().sendMessage(message, userId);
    }

    @Override
    public void receive(String message) {
        System.out.printf("user:%d Receiving %s \n", getId(), message);
    }
}
