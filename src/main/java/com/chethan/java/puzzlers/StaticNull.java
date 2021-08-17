package com.chethan.java.puzzlers;

public class StaticNull {
    public static void greet(){
        System.out.println("19-Dec-2020");
    }

    public static void main(String[] args) {
        StaticNull staticNull = null;
        staticNull.greet();
        // A qualifying expression for a static method invocation is evaluated, but its value is ignored
        ((StaticNull)null).greet();
        // Equivalent to
        StaticNull.greet();
        // Equivalent to
        greet();
    }
}
