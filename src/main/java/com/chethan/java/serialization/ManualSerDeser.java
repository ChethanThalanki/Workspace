package com.chethan.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * C implements Serializable & has D --> NotSerializableException
 * Sol 1: Mark D as transient (C is built with null D)
 * Sol 2:
 */
public class ManualSerDeser {
    public static void main(String[] args) {
        D d = new D(3);
        C c = new C(1,2,d);
        try {
            FileOutputStream fos = new FileOutputStream("files/d.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(c);

            FileInputStream fis = new FileInputStream("files/d.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            C serC = (C) ois.readObject();
            System.out.println(serC);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class C implements Serializable{
    private int a;
    private int b;
    private transient D d;

    public C() {
        System.out.println("Invoking no arg ctr of "+A.class.getName());
    }

    public C(int a, int b, D d) {
        this.a = a;
        this.b = b;
        this.d = d;
    }

    private void writeObject(ObjectOutputStream oos){
        System.out.println("In writeObject");
        try{
            oos.defaultWriteObject();
            oos.writeInt(d.getValue());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois){
        System.out.println("In readObject");
        try {
            ois.defaultReadObject();
            D d = new D(ois.readInt());
            this.d = d;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "C{" +
                "a=" + a +
                ", b=" + b + ", d=" + d +
                '}';
    }
}

class D {
    private int c;

    public D(int c) {
        this.c = c;
    }

    public int getValue() {
        return c;
    }

    @Override
    public String toString() {
        return "D{" +
                "c=" + c +
                '}';
    }
}