package com.chethan.java.innerclass;

public class Regular {
    private int x;

    public void setX(int x) {
        this.x = x;
    }

    public void getX() {
        System.out.println("Value of x from inner class = " + new RegularInner().getX());
    }

    class RegularInner {
        int x = 0;

        public RegularInner() {
            System.out.println("Inner Class ref : "  + this);
            System.out.println("Outer Class ref : "  + Regular.this);
        }

        public int getX(){
            System.out.println("Value of x in outer class = " + x);
            System.out.println("Value of x in outer accessing through = " + Regular.this.x);
            return Regular.this.x;
        }

        // Accessing outer class value through this reference
        public Regular getOuter(){
            return Regular.this;
        }
    }

    public static void main(String[] args) {
        Regular regularInner = new Regular();
        RegularInner rii = regularInner.new RegularInner();
        regularInner.setX(10);
        rii.getX();
        regularInner.setX(110);
        rii.getX();
        regularInner.getX();

        RegularInner rii1 = new Regular().new RegularInner();
        rii1.getX();
        Regular ri1 =rii1.getOuter();
        ri1.setX(20);
        rii1.getX();
    }
}
