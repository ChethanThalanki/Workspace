package com.chethan.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Test 1: A implements Serializable
 * Test 2: B extends A
 * Test 3: B extends A implements Serializable - No arg ctr is required
 */
public class SerDeser {
    public static void main(String[] args) {
        B b = new B(1,2,3);
        try {
            FileOutputStream fos = new FileOutputStream("files/b.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(b);

            FileInputStream fis = new FileInputStream("files/b.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            A serA = (A) ois.readObject();
            System.out.println(serA);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class A {
    private int a;
    private int b;

    public A() {
        System.out.println("Invoking no arg ctr of "+A.class.getName());
    }

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

class B extends A implements Serializable{
    private int c;

    public B(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
         ", B{" +
                "c=" + c +
                '}';
    }
}
