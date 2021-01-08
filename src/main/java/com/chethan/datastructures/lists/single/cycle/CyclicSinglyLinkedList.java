package com.chethan.datastructures.lists.single.cycle;

import com.chethan.datastructures.lists.single.SLLNode;

public class CyclicSinglyLinkedList {
    private SLLNode tail;

    public SLLNode getTail() {
        return tail;
    }

    public void print(){
        SLLNode temp = tail;
        if(temp != null){
            System.out.print("["+temp.getData() + "] --> ");
            temp = temp.getNext();
        }
        while(temp != tail){
            System.out.print("["+temp.getData() + "] --> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    public void printRev(){
        System.out.print("Printing in reverse order { ");
        printRev(tail);
        System.out.println(" null }");
    }

    private void printRev(SLLNode temp){
        if(temp != tail) {
            printRev(temp.getNext());
            System.out.print("["+temp.getData() + "] --> ");
        }
    }

    public void insertAtFront(int val){
        SLLNode newNode = new SLLNode(val);
        if(tail == null){
            newNode.setNext(newNode);
        }else {
            newNode.setNext(tail);
            SLLNode temp = tail;
            while(temp.getNext() != tail){
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        tail = newNode;
    }

    public void insertAtEnd(int val){
        SLLNode newNode = new SLLNode(val);
        SLLNode cur = tail;
        if(cur == null){
            tail = newNode;
            return;
        }else {
            while (cur.getNext() != tail) {
                cur = cur.getNext();
            }
            cur.setNext(newNode);
        }
        newNode.setNext(tail);
    }

    public void insertAtPosition(int val, int pos){
        SLLNode newNode = new SLLNode(val);
        if(pos < 0){
            System.out.println("Position is less than 0. Cannot insert " + val);
            return;
        }
        if(pos == 0){
            insertAtFront(val);
            return;
        }
        int index = 0;
        SLLNode cur = tail, prev = null;
        while(cur.getNext() != tail && index < pos){
            prev = cur;
            cur = cur.getNext();
            index++;
        }
        if(index == pos){
            prev.setNext(newNode);
            newNode.setNext(cur);
        }else if(index + 1 == pos){
            insertAtEnd(val);
        }
        else{
            System.out.println("Cannot insert at position " + pos);
        }
    }

    public void deleteAtFront(){
        if(tail == null){
            System.out.println("Cannot delete. List is empty!");
            return;
        }
        SLLNode cur = tail;
        tail = tail.getNext();
        System.out.println("Deleted value --> "+cur.getData());
    }

    public void deleteAtEnd(){
        if(tail == null){
            System.out.println("Cannot delete. List is empty!");
            return;
        }
        SLLNode cur = tail, prev = null;
        while(cur != null && cur.getNext() != null){
            prev = cur;
            cur = cur.getNext();
        }
        prev.setNext(null);
        System.out.println("Deleted value --> "+cur.getData());
    }

    public void deleteAtPos(int pos){
        if(tail == null){
            System.out.println("Cannot delete. List is empty!");
            return;
        }
        if(pos == 0 ){
            deleteAtFront();
            return;
        }
        SLLNode cur = tail, prev = null;
        int index = 0;
        while(cur != null && cur.getNext() != null && index < pos){
            prev = cur;
            cur = cur.getNext();
            index++;
        }
        if(pos == index) {
            prev.setNext(null);
            System.out.println("Deleted value --> " + cur.getData() + " at positions: " + pos);
        }else{
            System.out.println("Cannot delete at position " + pos);
        }
    }

    void reverseIterative() {
        SLLNode cur = tail, prev = null, next = null;
        while(cur != null) {
            next = cur.getNext();
            cur.setNext(prev);
            prev = cur;
            cur = next;
        }
        tail = prev;
    }

    public void reverseRec(){
        tail = reverseRecursion(tail);
    }

    private SLLNode reverseRecursion(SLLNode temp) {
        if(null == temp || null == temp.getNext()) return temp;
        SLLNode next= temp.getNext();
        temp.setNext(null);
        SLLNode reverseRem = reverseRecursion(next);
        next.setNext(temp);
        return reverseRem;
    }

    public void nThNodeFromEnd(int n){
        SLLNode cur = tail, nThNode = tail;
        for(int index = 0; cur != null && index < n; cur = cur.getNext(), index++);
        while(cur != null){
            cur = cur.getNext();
            nThNode = nThNode.getNext();
        }
        System.out.println("Nth Node : " + nThNode.getData());
    }

    public void nThNodeFromEndRecursive(SLLNode node, int n, int counter){
        if(node != null){
            nThNodeFromEndRecursive(node.getNext(), n, counter);
            counter ++;
            if(counter == n){
                System.out.println("Nth Node Recursive : " + node.getData());
            }
        }
    }

    // return length/n th node
    public void fractionalNode(int n){
        SLLNode fraction = null, cur = tail;
        for(int i = 1; cur != null ; cur = cur.getNext(), i++){
            if(i % n == 0){
                if(fraction == null) fraction = tail;
                else fraction = fraction.getNext();
            }
        }
        if(fraction != null)
            System.out.println("Fraction node : " + fraction.getData());
        else
            System.out.println("No. of nodes are less than " + n + " , cannot return fraction node.");
    }
}

