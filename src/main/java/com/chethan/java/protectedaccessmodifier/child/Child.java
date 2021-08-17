package com.chethan.java.protectedaccessmodifier.child;

import com.chethan.java.protectedaccessmodifier.parent.Parent;

public class Child extends Parent {
    void test(){
        System.out.println(a);
    }

    void test1(){
        Parent p = new Parent();
        //System.out.println(p.a);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.test();
        System.out.println(c.a);
    }
}
