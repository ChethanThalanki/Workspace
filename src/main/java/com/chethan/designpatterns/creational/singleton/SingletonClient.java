package com.chethan.designpatterns.creational.singleton;

// java.lang.Runtime
public class SingletonClient {
    public static void main(String[] args) {
        EagerSingleton singleton = EagerSingleton.getInstance();
        System.out.println(singleton);
        System.out.println(EagerSingleton.getInstance());

        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
        System.out.println(LazySingleton.getInstance());

        DoubleLockingSingleton doubleLockingSingleton = DoubleLockingSingleton.getInstance();
        System.out.println(doubleLockingSingleton);
        System.out.println(DoubleLockingSingleton.getInstance());

        System.out.println(BillPughSingleton.getInstance());
    }
}
