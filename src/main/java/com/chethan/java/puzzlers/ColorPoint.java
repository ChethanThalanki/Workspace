package com.chethan.java.puzzlers;

class Point{
    private final int x, y;
    private final String name;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        name = makeName(); // 3. Invoke subclass method
    }

    protected String makeName() {
        return "["+x+","+y+"]";
    }

    public final String toString(){
        return name;
    }

}

public class ColorPoint extends Point{

    private final String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y); // 2. Chain to Point constructor
        this.color = color; // 5. Initialize blank final-Too late
    }

    protected String makeName(){
        // 4. Executes before subclass constructor body!
        return super.makeName()+":"+color;
    }

    public static void main(String[] args) {
        // 1. Invoke subclass constructor
        System.out.println(new ColorPoint(1,2, "Purple"));
    }
}

