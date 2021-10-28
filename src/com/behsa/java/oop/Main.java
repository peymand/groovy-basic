package com.behsa.java.oop;

import com.behsa.groovy.oop.*;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

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

        Object s = new Cat();
        s.toString();

        Computer c = new Computer("Motorella");
        c.turnOn();

        Employee.Info info = new Employee.Info();


        ArrayList<String> list = new ArrayList<>();
        list.add("ali");
        list.add("12");
        list.add("reza");
        list.add("144");

        for (String item : list) {
            System.out.println(item);
        }

        Stream<String> stream =  list.stream();

        Consumer<String> c1 = (s1) -> System.out.println(s1);
        Supplier<String> supplier = () -> "123";
        Predicate<String> ifIsNumerical = (input) -> {
            if(input.matches("[0-9]+")) return true;
            else return false;
        };
        stream
                .filter(ifIsNumerical)
                .forEach((s1) -> System.out.println(s1));


    }

    public static void f(int ... args){
        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);
        }
    }
    public void f2(Object s){

        //annonymous inner class

        int x = 123;

        Operation op = (i, j) -> {
                System.out.println(x);
                return i + j + x;
            };

        int res = op.sum(1,1);



    }
}
