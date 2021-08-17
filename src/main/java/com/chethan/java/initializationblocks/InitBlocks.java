package com.chethan.java.initializationblocks;

/**
 * Constructor sequence with Initialization Blocks
 */
public class InitBlocks {
    public static void main(String[] args) {
        new Init();
        System.out.printf("\n\n\n");
        new Init(1);
    }
}

class InitParent{
    int x;
    InitParent(int val){
        x = val;
        System.out.println("InitParent Paramterized ctr");
    }
    InitParent(){
        System.out.println("InitParent Default ctr");
    }
    {
        System.out.println("InitParent In 1st instance Init");
    }
    static {
        System.out.println("InitParent In 1st static Init");
    }
    {
        System.out.println("InitParent In 2nd instance Init");
    }
    static {
        System.out.println("InitParent In 2nd static Init");
    }
}

class Init extends InitParent{
    int x;
    static int y;
    Init(int val){
        super(val);
        x = val;
        System.out.println("Paramterized ctr");
    }
    Init(){
        System.out.println("Default ctr");
    }
    {
        System.out.println("In 1st instance Init");
    }
    static {
        y = 10;
        System.out.println("In 1st static Init");
    }
    {
        System.out.println("In 2nd instance Init");
    }
    static {
        System.out.println("In 2nd static Init");
    }
}
