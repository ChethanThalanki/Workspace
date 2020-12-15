package com.chethan.designpatterns.behavioral.visitor;

public class DLinkRouter implements Router {
    @Override
    public void send(char[] data) {
    }

    @Override
    public void receive(char[] data) {
    }

    @Override
    public void accept(RouterVisitor v) {
        v.visit(this);
    }
}
