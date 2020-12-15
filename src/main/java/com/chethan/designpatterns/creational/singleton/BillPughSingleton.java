package com.chethan.designpatterns.creational.singleton;

public class BillPughSingleton {
    private BillPughSingleton(){}

    public static class BillPughSingletonProvider{
        private static volatile BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return BillPughSingletonProvider.instance;
    }
}
