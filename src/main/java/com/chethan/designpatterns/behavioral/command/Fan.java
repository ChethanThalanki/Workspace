package com.chethan.designpatterns.behavioral.command;

public class Fan {
    boolean state;

    public void turnOn(){
        setState(true);
        System.out.println("Fan started!");
    }

    public void turnOff(){
        setState(false);
        System.out.println("Fan stopped!");
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
