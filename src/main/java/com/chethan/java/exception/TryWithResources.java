package com.chethan.java.exception;

import java.io.FileInputStream;

/**
 * Program to check the suppressed exceptions
 * And Closeable vs AutoCloseable interfaces close() --> idempotent
 */
public class TryWithResources {
    public static void main(String[] args) {
        try(MyResource r = new MyResource();
            //MyResource r1 = new MyResource();
            FileInputStream fis = new FileInputStream("a.txt");
            FileInputStream fis1 = new FileInputStream("b.txt")){

        }catch (Exception e){
            e.printStackTrace();
            Throwable[] suppressed = e.getSuppressed();
            for(Throwable t : suppressed){
                t.printStackTrace();
            }
        }
    }
}

class MyResource implements AutoCloseable{

    @Override
    public void close() throws Exception {
        throw new IllegalArgumentException("Ex " + 10*Math.random());
    }
}
