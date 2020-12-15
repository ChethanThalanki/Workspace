package com.chethan.java;

public class CloneableTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A(10);
        B b = new B(a);
        System.out.printf("Original %d, cloned %d", a.getI(), b.getA().getI());
        a.setI(20);
        System.out.printf("Original %d, cloned %d", a.getI(), b.getA().getI());
    }
}

class A implements Cloneable
{
    //member attributes and methods
    private int i;

    public A(int i) {
        System.out.println("Constructor of A");
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class B{
    A a;

    public B(A a) {
        this.a = a;
    }

    public A getA() throws CloneNotSupportedException {
        if(a instanceof A){
            System.out.println("Returning cloneable A");
            return  (A)a.clone();
        }
        return null;
    }
}