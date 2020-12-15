package com.chethan.designpatterns.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private int i = 10;

    private static volatile SerializedSingleton instance;

    public static SerializedSingleton getInstance(){
        if(null == instance){
            instance = new SerializedSingleton();
        }
        return instance;
    }

    private SerializedSingleton(){}

    /**
     * return the existing instance to ensure a single instance application wide
     */
    protected Object readResolve(){
        return getInstance();
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
