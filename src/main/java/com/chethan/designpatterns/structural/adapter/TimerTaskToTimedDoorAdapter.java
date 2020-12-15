package com.chethan.designpatterns.structural.adapter;

import com.chethan.designpatterns.structural.adapter.door.TimedDoor;
import com.chethan.designpatterns.structural.adapter.timerapi.TimerTask;

// Convert the interface of a class into another interface clients expect
//java.util.Arrays#asList()
//java.io.OutputStreamWriter(OutputStream)
//javax.xml.bind.annotation.adapters.XmlAdapter#marshal() and #unmarshal()
public class TimerTaskToTimedDoorAdapter extends TimerTask {
    private TimedDoor adaptee;

    public TimerTaskToTimedDoorAdapter(TimedDoor timedDoor) {
        super();
        this.adaptee = timedDoor;
    }

    @Override
    public void run() {
        adaptee.makeSound();
    }
}
