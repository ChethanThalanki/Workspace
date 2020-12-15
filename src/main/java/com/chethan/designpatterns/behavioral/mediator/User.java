package com.chethan.designpatterns.behavioral.mediator;

public abstract class User {
    private int id;
    private String name;

    private IChatRoom mediator;

    public User(int id, String name, IChatRoom chatRoom) {
        this.id = id;
        this.name = name;
        this.mediator = chatRoom;
    }

    public IChatRoom getMediator() {
        return mediator;
    }

    public abstract void send(String message, int userId);
    public abstract void receive(String message);

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
