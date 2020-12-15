package com.chethan.designpatterns.behavioral.command;

import org.junit.jupiter.api.Test;

// Actions of menu items, Undo, wizards Ex: Runnable
public class CommandTest {

    @Test
    void fanOnTest(){
        Remote remote = new Remote(); // Invoker
        Fan fan = new Fan(); // Receiver

        remote.setCommand(new FanOnCommand(fan)); // Command
        remote.buttonPressed();
    }

    @Test
    void fanToggleTest(){
        Remote remote = new Remote(); // Invoker
        Fan fan = new Fan(); // Receiver
        FanToggleCommand toggleCommand = new FanToggleCommand(fan); // Command

        remote.setCommand(toggleCommand);
        remote.buttonPressed();
        remote.buttonPressed();
    }
}
