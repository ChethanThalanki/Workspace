package com.chethan.java.innerclass;

public class Anonymous {
    public void method(){
        System.out.println("This is a from Anonymous1.method()");
    }

    public void useAnonymous2(Anonymous2 a2){
        a2.method();
    }

    public static void main(String[] args) {
        // Type 1 : Class
        Anonymous a = new Anonymous(){
            @Override
            public void method() {
                System.out.println("This is a from sub class Anonymous method()");
                method1();
            }

            public void method1() {
                System.out.println("This is extra method1");
            }
        };
        a.method();
        new Anonymous().method();

        // Type 2 : Interface
        Anonymous2 a2 = new Anonymous2() {
            @Override
            public void method() {
                System.out.println("This is a from implementation class Anonymous2 method()");
            }
        };
        a2.method();

        // Method local in argument
        a.useAnonymous2(new Anonymous2() {
            @Override
            public void method() {
                System.out.println("Method local inner class");
            }
        });
    }
}

interface Anonymous2{
    void method();
}
