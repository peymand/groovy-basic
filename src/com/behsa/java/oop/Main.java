package com.behsa.java.oop;

import com.behsa.groovy.oop.Animal;
import com.behsa.groovy.oop.Cat;

public class Main {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        f();
        f(1);
        f(1,2);
        String str = new String("");

        int x = 4;
        float y = x;

//        Integer c = new Float(2);
        Animal a = new Cat();  //def a -> Cat
        Object o = new Cat();
        Cat z  = (Cat) o;
        f2("");
        Object s = new Cat();
        s.toString();
    }

    public static void f(int ... args){
        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);
        }
    }
    public static void f2(Object s){

    }
}
