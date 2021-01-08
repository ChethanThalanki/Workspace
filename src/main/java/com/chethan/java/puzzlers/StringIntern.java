package com.chethan.java.puzzlers;

public class StringIntern {
    public static void main(String[] args) {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();
        String dog1 = "length: 10";// Interned with pig

        System.out.println("Animals are equal: " + pig == dog);
        System.out.println(("Above line behavior Animals are equal: " + pig) == dog);

        System.out.println("Fix Animals are equal? : " + (pig == dog));
        System.out.println("Interned Animals are equal? : " + (pig == dog1));
        System.out.println("Fix Animals are equal? using equals(): " + pig.equals(dog));

        // \u0022 is the Unicode escape for double quote (")
        System.out.println("a\u0022.length() + \u0022b".length());
    }
}
