package com.chethan.java.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        Generics g = new Generics();
        List allTypes = new ArrayList();
        allTypes.add(1);
        allTypes.add(1.0f);
        allTypes.add(g);
        allTypes.add("new Generics");
        g.addObject(allTypes);
        System.out.println(allTypes);

        List<String> strings = new ArrayList<>();
        strings.add("1");
        g.addObject(strings);
        System.out.println(strings);

        g.arrayInheritance();

        g.genericInheritance();
    }

    // No protection - typeErasure
    private void addObject(List list){
        list.add(new Object());
    }

    // Compile time protection
    private void addString(List<String> list){
        //list.add(new Object());
    }

    private void arrayInheritance(){
        Parent[] p = new Child[3];
        p[0] = new Child();
        //p[1] = new Child1();//ArrayStoreException should be only Child
        //p[2] = new Parent();
        System.out.println(Arrays.toString(p));

        Child1[] child1s = new Child1[3];
        child1s[1] = new Child1();
        child1s[2] = new Child1();
        System.out.println(child1s);
        //set1stChild(child1s); // Run-time exception - No compile time support
        System.out.println(child1s);
    }

    private void set1stChild(Parent[] p){
        p[0] = new Child();
    }

    private void genericInheritance() {
        List<Parent> p = new ArrayList<>();
        p.add(new Parent());
        p.add(new Child());
        p.add(new Child1());

        System.out.println(p);
        set1stChild(p);
        addChild(p);
        addChild1(p);
        System.out.println(p);
    }

    private void set1stChild(List<Parent> p){
        p.set(0 , new Child());
    }

    // No type check as generic type is parent
    private void addChild(List<Parent> p){
        p.add(new Child());
    }

    private void addChild1(List<? super Child1> p){
        p.add(new Child1());
    }

    // add method is not supported
    private void getChild1(List<? extends Child1> p){
        //p.add(new Parent());
    }

    private class Parent{
        @Override
        public String toString() {
            return super.toString();
        }
    }
    private class Child extends Parent{
        @Override
        public String toString() {
            return super.toString();
        }
    }

    private class Child1 extends Parent{}
}


