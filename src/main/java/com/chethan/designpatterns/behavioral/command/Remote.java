package com.chethan.designpatterns.behavioral.command;

public class Remote {
    ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void buttonPressed(){
        System.out.println("Button pressed ");
        command.execute();
    }
}
