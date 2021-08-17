package com.chethan.lombok;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//@Accessors(fluent = true)
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class LombokPerson {
    private String name;
    private int age;
    private StringBuilder skills;


    public static void main(String[] args) {
        try {
            LombokPerson p = new LombokPerson();
            System.out.println(p.getClass());
            byte[] bytes = new byte[1024];
            System.out.println(bytes.getClass());
            byte i = 0;
            System.out.println(byte.class);
            Class lombokPersonClass = Class.forName("com.chethan.lombok.LombokPerson");
            /*for(Method m : lombokPersonClass.getMethods()){
                System.out.println(m.getModifiers() +" " +m.getReturnType() + " " + m.getName());
            }*/
            for(Method m : lombokPersonClass.getDeclaredMethods()){
                System.out.println(m.getReturnType() + " " + m.getName());
            }

            for(Constructor c : lombokPersonClass.getConstructors()){
                System.out.println(c.getName() + " "+c.getParameterCount());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
