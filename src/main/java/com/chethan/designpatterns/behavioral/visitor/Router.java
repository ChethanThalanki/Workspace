package com.chethan.designpatterns.behavioral.visitor;

public interface Router {
    void send(char[] data);
    void receive(char[] data);
    void accept(RouterVisitor v);
}
