package com.chethan.designpatterns.creational.singleton;

public class DoubleLockingSingleton {
    private static volatile DoubleLockingSingleton instance;

    private DoubleLockingSingleton(){}

    public static DoubleLockingSingleton getInstance(){
        if(null == instance){
            synchronized (DoubleLockingSingleton.class){
                if(null == instance){ // Double checked locking
                    instance = new DoubleLockingSingleton();
                }
            }
        }
        return instance;
    }
}
