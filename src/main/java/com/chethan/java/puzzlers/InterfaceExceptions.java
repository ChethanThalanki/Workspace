package com.chethan.java.puzzlers;

interface Type1{
    void method1() throws CloneNotSupportedException;
}

interface Type2{
    void method1() throws InterruptedException;
}

interface Type3 extends Type1, Type2{

}

public class InterfaceExceptions implements Type3{
    @Override
    public void method1() {
        System.out.println("Implement Type3");
    }

    public static void main(String[] args) {
        InterfaceExceptions interfaceExceptions = new InterfaceExceptions();
        interfaceExceptions.method1();
        // This program compiles because
        // The set of checked exceptions that a method can throw is the intersection of the sets of checked exceptions
        // that it is declared to throw in all applicable types, not the union
    }
}