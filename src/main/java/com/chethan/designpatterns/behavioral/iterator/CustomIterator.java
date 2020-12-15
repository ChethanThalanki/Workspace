package com.chethan.designpatterns.behavioral.iterator;

public interface CustomIterator<E> {
    void reset();
    E next();
    boolean hasNext();
    E currentItem();
}
