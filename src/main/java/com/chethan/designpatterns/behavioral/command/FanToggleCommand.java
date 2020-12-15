package com.chethan.designpatterns.behavioral.command;

public class FanToggleCommand implements ICommand{
    Fan fan;

    public FanToggleCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        if(fan.isState()){
            System.out.println("Fan is in ON state. Turning OFF");
            fan.turnOff();
        }else{
            System.out.println("Fan is in OFF state. Turning ON");
            fan.turnOn();
        }
    }
}
