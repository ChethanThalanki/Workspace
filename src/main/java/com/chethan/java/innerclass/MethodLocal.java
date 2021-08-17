package com.chethan.java.innerclass;

public class MethodLocal {
    private String val = "Value";

    public void method(){
        int i=120;
        // Commenting below line as i is accessed from inner class it should be final/effectively final
        //i++;
        class MethodLocalInner{
            public String getVal(){
                System.out.println(i);
                return val;
            }
        }


        MethodLocalInner mli = new MethodLocalInner();
        System.out.println(mli.getVal());
    }

    public static void main(String[] args) {
        MethodLocal ml = new MethodLocal();
        ml.method();
    }
}
