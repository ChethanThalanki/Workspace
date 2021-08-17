package com.chethan.java.innerclass;

public class Nested {
    int x;
    static int y = 1000;
    static class NestedClass{
        public void getY(){
            System.out.println("Y = " + y);
        }
    }

    public static void main(String[] args) {
        Nested n = new Nested();
        NestedClass nc = new Nested.NestedClass();
        nc.getY();
    }
}
