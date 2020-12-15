package com.chethan.designpatterns.structural.adapter.door;

public class Door {
	boolean open;

	public boolean isOpen() {
		return open;
	}

	public void open(){
		open = true;
	}

	public void close(){
		open = false;
	}

}
