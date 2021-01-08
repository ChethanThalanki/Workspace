package com.chethan.datastructures.lists.single;

public class SinglyLinkedList {
    private SLLNode head;

    public SLLNode getHead() {
        return head;
    }

    public void print(){
        SLLNode temp = head;
        while(temp != null){
            System.out.print("["+temp.getData() + "] --> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    public static void print(SLLNode temp){
        while(temp != null){
            System.out.print("["+temp.getData() + "] --> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    public void printRev(){
        System.out.print("Printing in reverse order { ");
        printRev(head);
        System.out.println(" null }");
    }

    private void printRev(SLLNode temp){
        if(temp != null) {
            printRev(temp.getNext());
            System.out.print("["+temp.getData() + "] --> ");
        }
    }

    public void insertAtFront(int val){
        SLLNode newNode = new SLLNode(val);
        newNode.setNext(head);
        head = newNode;
    }

    public void insertAtEnd(int val){
        SLLNode newNode = new SLLNode(val);
        SLLNode cur = head, prev = null;
        if(cur == null){
            head = newNode;
            return;
        }else {
            while (cur != null) {
                prev = cur;
                cur = cur.getNext();
            }
            prev.setNext(newNode);
        }
    }

    public void insertAtPosition(int val, int pos){
        SLLNode newNode = new SLLNode(val);
        if(pos < 0){
            System.out.println("Position is less than 0. Cannot insert " + val);
            return;
        }
        if(pos == 0){
            newNode.setNext(head);
            head = newNode;
            return;
        }
        int index = 0;
        SLLNode cur = head, prev = null;
        while(cur != null && index < pos){
            prev = cur;
            cur = cur.getNext();
            index++;
        }
        if(index == pos){
            prev.setNext(newNode);
            newNode.setNext(cur);
        }else{
            System.out.println("Cannot insert at position " + pos);
        }
    }

    public void deleteAtFront(){
        if(head == null){
            System.out.println("Cannot delete. List is empty!");
            return;
        }
        SLLNode cur = head;
        head = head.getNext();
        System.out.println("Deleted value --> "+cur.getData());
    }

    public void deleteAtEnd(){
        if(head == null){
            System.out.println("Cannot delete. List is empty!");
            return;
        }
        SLLNode cur = head, prev = null;
        while(cur != null && cur.getNext() != null){
            prev = cur;
            cur = cur.getNext();
        }
        prev.setNext(null);
        System.out.println("Deleted value --> "+cur.getData());
    }

    public void deleteAtPos(int pos){
        if(head == null){
            System.out.println("Cannot delete. List is empty!");
            return;
        }
        if(pos == 0 ){
            deleteAtFront();
            return;
        }
        SLLNode cur = head, prev = null;
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
        SLLNode cur = head, prev = null, next = null;
        while(cur != null) {
            next = cur.getNext();
            cur.setNext(prev);
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    public void reverseRec(){
        head = reverseRecursion(head);
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
        SLLNode cur = head, nThNode = head;
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
        SLLNode fraction = null, cur = head;
        for(int i = 1; cur != null ; cur = cur.getNext(), i++){
            if(i % n == 0){
                if(fraction == null) fraction = head;
                else fraction = fraction.getNext();
            }
        }
        if(fraction != null)
            System.out.println("Fraction node : " + fraction.getData());
        else
            System.out.println("No. of nodes are less than " + n + " , cannot return fraction node.");
    }

    public void insertInSortedOrder(int val){
        SLLNode newNode = new SLLNode(val);
        if(head == null){
            head = newNode;
        }else{
            SLLNode temp = head, prev = null;
            while(temp != null && temp.getData() < val){
                prev = temp;
                temp = temp.getNext();
            }
            if(prev == null){
                newNode.setNext(temp);
                head = newNode;
            }else{
                newNode.setNext(temp);
                prev.setNext(newNode);
            }
        }
    }

    public static SLLNode mergeTwoSortedLists(SLLNode head1, SLLNode head2){
        SLLNode head = null;
        if(head1 == null && head2 == null) return head;
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        if(head1.getData() < head2.getData()){
            head = head1;
            head.setNext(mergeTwoSortedLists(head1.getNext(), head2));
        }else{
            head = head2;
            head.setNext(mergeTwoSortedLists(head1, head2.getNext()));
        }

        return head;
    }

    public static SLLNode mergeTwoSortedListsIterative(SLLNode head1, SLLNode head2){
        SLLNode head = new SLLNode(1);
        SLLNode cur = null;

        while(head1 != null && head2 != null) {
            if (head1.getData() < head2.getData()) {
                cur = head1;
                head1 = head1.getNext();
            } else {
                cur = head2;
                head2 = head2.getNext();
            }
            if(head.getNext() == null){
                head.setNext(cur);
            }
        }
        if(head1 != null && cur != head1){
            cur.setNext(head1);
        } else if(head2 != null && cur != head2){
            cur.setNext(head2);
        }
        return head.getNext();
    }
}
