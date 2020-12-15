package com.chethan.designpatterns.structural.decorator.impl;

import com.chethan.designpatterns.structural.decorator.collectionsapi.CustomCollection;

import java.util.Collection;

public class AddCountingList extends CountingDecoratorBase{
    int count;

    public AddCountingList(CustomCollection wrappe) {
        super(wrappe);
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean add(Object var1) {
        count++;
        return super.add(var1);
    }

    @Override
    public void addAll(Collection var1) {
        count += var1.size();
        super.addAll(var1);
    }
}
