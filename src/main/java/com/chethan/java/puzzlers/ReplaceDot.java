package com.chethan.java.puzzlers;

import java.util.regex.Pattern;

public class ReplaceDot {

    public static void main(String[] args) {
        try {
            // Regex
            System.out.println(ReplaceDot.class.getName().replaceAll(".", "/"));
            // Actual replace
            System.out.println(ReplaceDot.class.getName().replaceAll("\\.", "/"));
            // Using Pattern
            System.out.println(ReplaceDot.class.getName().replaceAll(Pattern.quote("."), "/"));
        }
        // Though above code does not throw any checked exception
        // Catch can be present for Exception/Throwable
        catch (Exception e){

        }
        catch (Throwable t){

        }
    }

}
