package com.chethan.java.ex1.a;

import com.chethan.java.ex1.b.B;

public class A {
    public static void main(String[] args) {
        B b = new B();
        int i = 1;
        b.test(i);
        b.test((short) i);
    }
}
