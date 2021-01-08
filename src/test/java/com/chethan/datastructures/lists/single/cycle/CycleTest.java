package com.chethan.datastructures.lists.single.cycle;

import com.chethan.datastructures.lists.single.SinglyLinkedList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CycleTest {
    private CyclicSinglyLinkedList list;

    @BeforeEach
    void init(){
        list = new CyclicSinglyLinkedList();
    }

    @AfterEach
    void cleanup(){
        list.print();
        list = null;
    }

    @Test
    void insertAtFront(){
        list.insertAtFront(4);
        list.insertAtFront(2);
        list.insertAtFront(1);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtEnd(8);
        list.print();
        list.insertAtPosition(3, 2);
        list.insertAtPosition(5, 4);
        list.insertAtPosition(0, 0);
        list.insertAtPosition(9, 9);
    }
}
