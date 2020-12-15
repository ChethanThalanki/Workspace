package com.chethan.designpatterns.structural.decorator.collectionsapi;

import java.util.Collection;

public interface CustomCollection {
    int size();

    boolean add(Object var1);

    void addAll(Collection var1);

    boolean remove(Object var1);
}
