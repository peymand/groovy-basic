package com.behsa.java.oop;

public class Main {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        f();
        f(1);
        f(1,2);
        String str = new String("");
        str.
    }

    public static void f(int ... args){
        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);
        }
    }
}
