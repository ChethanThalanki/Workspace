package com.chethan.designpatterns.structural.decorator.collectionsapi;

import java.util.Collection;

public class CustomLinkedList implements CustomCollection{
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(Object var1) {
        return false;
    }

    @Override
    public void addAll(Collection var1) {

    }

    @Override
    public boolean remove(Object var1) {
        return false;
    }
}
