package com.chethan.java.puzzlers;

public class ConstructorOverflow {
    private ConstructorOverflow obj = new ConstructorOverflow();

    public ConstructorOverflow() throws Exception{
        throw new Exception("Inside Constructor");
    }

    public static void main(String[] args) {
        try {
            ConstructorOverflow b = new ConstructorOverflow();
            System.out.println("Surprise!");
        }catch (Exception e){
            System.out.println("I told you so!");
        }
    }

    // Like most programs that throw a StackOverflowError, this one contains an infinite recursion.
    // When you invoke a constructor, the instance variable initializers run before the body of the constructor.
    // In this case, the initializer for the variable internalInstance invokes the constructor recursively.
    // That constructor, in turn, initializes its own internalInstance field by invoking the constructor again and so on
}
