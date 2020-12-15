package com.chethan.designpatterns.behavioral.command;

public class FanOnCommand implements ICommand{

    Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        System.out.println("Turning on the fan");
        fan.turnOn();
    }
}
