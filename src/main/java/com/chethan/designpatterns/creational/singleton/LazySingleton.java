package com.chethan.designpatterns.creational.singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(null == instance){
            synchronized (LazySingleton.class) {
                System.out.println("Creating new lazy object");
                instance = new LazySingleton();
            }
        }
        return instance;
    }
}
