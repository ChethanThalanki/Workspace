package com.chethan.designpatterns.structural.decorator.impl;

import com.chethan.designpatterns.structural.decorator.collectionsapi.CustomCollection;

import java.util.Collection;

public class CountingDecoratorBase implements CustomCollection {

    private CustomCollection wrappe;

    public CountingDecoratorBase(CustomCollection wrappe) {
        this.wrappe = wrappe;
    }

    @Override
    public int size() {
        return wrappe.size();
    }

    @Override
    public boolean add(Object var1) {
        return wrappe.add(var1);
    }

    @Override
    public void addAll(Collection var1) {
        wrappe.addAll(var1);
    }

    @Override
    public boolean remove(Object var1) {
        return wrappe.remove(var1);
    }
}
