package com.chethan.java.nio;

import java.io.Console;

public class JavaConsole {
    public static void main(String[] args) {
        //todo: NPE
        Console c = System.console();
        String userName = c.readLine("%s","Enter username: ");
        char[] pwd = c.readPassword("%s", "Enter password: ");
        System.out.printf("UserName = %s \n Password = %s", pwd);
    }
}
