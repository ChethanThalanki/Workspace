package com.chethan.designpatterns.structural.adapter.door;
import com.chethan.designpatterns.structural.adapter.TimerTaskToTimedDoorAdapter;
import com.chethan.designpatterns.structural.adapter.timerapi.Timer;

public class TimedDoor extends Door {
	
	public TimedDoor(){
		Timer t = new Timer();
		t.schedule(new TimerTaskToTimedDoorAdapter(this), "now", 100L);
	}
	
	public void makeSound(){
		while(isOpen())
			java.awt.Toolkit.getDefaultToolkit().beep();
	}
}
