package com.chethan.java.treeset;

import java.util.TreeSet;

public class Ferry {
    public static void main(String[] args) {
        TreeSet<Integer> times = new TreeSet<>();
        times.add(1205);
        times.add(1305);
        times.add(1405);
        times.add(1545);
        times.add(1830);
        times.add(2010);
        times.add(2100);

        //Java 5
        TreeSet<Integer> subset = (TreeSet<Integer>) times.headSet(1600);
        System.out.println("last train is "+ subset.last());

        subset = (TreeSet<Integer>) times.tailSet(2000);
        System.out.println("First train is "+ subset.first());

        //Java 6 - Does not throw NoSuchObject Exception
        System.out.println("last train is "+ times.lower(1200));
        System.out.println("first train is "+ times.higher(2100));
    }
}
