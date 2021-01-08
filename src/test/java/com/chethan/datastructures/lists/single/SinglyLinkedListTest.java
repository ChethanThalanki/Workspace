package com.chethan.datastructures.lists.single;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SinglyLinkedListTest {
    private SinglyLinkedList list;

    @BeforeEach
    void init(){
        list = new SinglyLinkedList();
    }

    @AfterEach
    void cleanup(){
        list.print();
        list = null;
    }

    @Test
    void insertAtFront(){
        list.insertAtFront(5);
        list.print();
        list.insertAtFront(1);
    }

    @Test
    void insertAtEnd(){
        list.insertAtEnd(1);
        list.print();
        list.insertAtEnd(2);
    }

    @Test
    void insertAtPos(){
        list.insertAtFront(1);
        list.insertAtEnd(4);
        list.insertAtPosition(3,1);
        list.insertAtPosition(2,1);
        list.insertAtPosition(-1,0);
        list.print();
        list.deleteAtFront();
        list.deleteAtFront();
        list.deleteAtFront();
        list.deleteAtFront();
        list.deleteAtFront();
        list.deleteAtFront();
    }

    @Test
    void deleteAtFront(){
        list.insertAtFront(1);
        list.insertAtEnd(4);
        list.insertAtPosition(3,1);
        list.insertAtPosition(2,1);
        list.insertAtPosition(-1,0);
        list.print();
        list.deleteAtFront();
        list.deleteAtFront();
        list.deleteAtFront();
        list.deleteAtFront();
        list.deleteAtFront();
        list.deleteAtFront();
    }

    @Test
    void delete(){
        list.insertAtFront(1);
        list.insertAtEnd(4);
        list.insertAtPosition(3,1);
        list.insertAtPosition(2,1);
        list.insertAtPosition(-1,0);
        list.print();
        list.deleteAtFront();
        list.deleteAtEnd();
        list.print();
        list.deleteAtPos(2);
        list.deleteAtPos(0);
        list.deleteAtPos(4);
    }

    @Test
    void reverseIterative(){
        list.insertAtFront(1);
        list.insertAtEnd(4);
        list.insertAtPosition(3,1);
        list.insertAtPosition(2,1);
        list.insertAtPosition(-1,0);
        list.print();
        list.reverseIterative();
        list.print();
        list.reverseRec();
        list.print();
        list.printRev();
    }

    @Test
    void nthNodeValue() {
        list.insertAtFront(1);
        list.insertAtEnd(4);
        list.insertAtPosition(3, 1);
        list.insertAtPosition(2, 1);
        list.insertAtPosition(-1, 0);
        list.nThNodeFromEnd(2);
        list.nThNodeFromEndRecursive(list.getHead(), 2, 0);
        list.nThNodeFromEnd(4);
    }

    @Test
    void fractionalNode() {
        list.insertAtFront(1);
        list.insertAtEnd(4);
        list.insertAtPosition(3, 1);
        list.insertAtPosition(2, 1);
        list.insertAtPosition(-1, 0);
        list.insertAtEnd(5);
        list.fractionalNode(2);
        list.fractionalNode(3);
        list.fractionalNode(6);
        list.fractionalNode(8);
        list.nThNodeFromEnd(4);
    }

    @Test
    void insertInSortedList(){
        list.insertInSortedOrder(10);
        list.insertInSortedOrder(1);
        list.insertInSortedOrder(4);
        list.insertInSortedOrder(5);
        list.insertInSortedOrder(3);
        list.insertInSortedOrder(8);
        list.insertInSortedOrder(6);
        list.insertInSortedOrder(2);
        list.insertInSortedOrder(2);
        list.insertInSortedOrder(0);
    }

    @Test
    void mergeSortedLists(){
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insertInSortedOrder(2);
        list1.insertInSortedOrder(4);
        list1.insertInSortedOrder(6);
        list1.insertInSortedOrder(7);
        list1.insertInSortedOrder(9);
        System.out.print("List1 ->");
        list1.print();
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insertInSortedOrder(0);
        list2.insertInSortedOrder(1);
        list2.insertInSortedOrder(3);
        list2.insertInSortedOrder(5);
        list2.insertInSortedOrder(8);
        list2.insertInSortedOrder(10);
        System.out.print("List2 ->");
        list2.print();
        SLLNode mergedHead = SinglyLinkedList.mergeTwoSortedLists(list1.getHead(), list2.getHead());
        System.out.println("Recursive merge print -->");
        SinglyLinkedList.print(mergedHead);

        mergedHead = SinglyLinkedList.mergeTwoSortedListsIterative(list1.getHead(), list2.getHead());
        System.out.println("Iterative merge print -->");
        SinglyLinkedList.print(mergedHead);
    }

    private void populateSortedList() {
        list = new SinglyLinkedList();
        list.insertInSortedOrder(10);
        list.insertInSortedOrder(1);
        list.insertInSortedOrder(4);
        list.insertInSortedOrder(5);
        list.insertInSortedOrder(3);
        list.insertInSortedOrder(8);
        list.insertInSortedOrder(6);
        list.insertInSortedOrder(2);
        list.insertInSortedOrder(2);
        list.insertInSortedOrder(0);
        list.insertInSortedOrder(7);
        list.print();
    }

    @Test
    void pairReversal(){
        populateSortedList();
        SLLNode head = list.pairReversalRecursive(list.getHead());
        System.out.print("Pair reversal Recursive == ");
        SinglyLinkedList.print(head);


        populateSortedList();
        head = list.pairReversalIterative(list.getHead());
        System.out.print("Pair reversal Iterative == ");
        SinglyLinkedList.print(head);
    }

    @Test
    void kBlocksReversal(){
        populateSortedList();
        SLLNode head = list.reverseKNodesRecursive(list.getHead(), 3);
        System.out.print("K Block reversal Recursive == ");
        SinglyLinkedList.print(head);

        populateSortedList();
        head = list.reverseKNodesIterative(list.getHead(),3);
        System.out.print("K Block reversal Iterative == ");
        SinglyLinkedList.print(head);
    }

    @Test
    void modularNode(){
        populateSortedList();
        list.modularNodeFromBeginning(3);
        list.modularNodeFromEnd(3);
    }
}
