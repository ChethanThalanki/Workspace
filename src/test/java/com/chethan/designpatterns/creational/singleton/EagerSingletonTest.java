package com.chethan.designpatterns.creational.singleton;

import com.chethan.designpatterns.creational.singleton.EagerSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EagerSingletonTest {
    @Test
    void isSingleton(){
        EagerSingleton singleton = EagerSingleton.getInstance();
        Assertions.assertNotNull(singleton);

        EagerSingleton singleton1 = EagerSingleton.getInstance();
        Assertions.assertSame(singleton, singleton1);
    }
}
