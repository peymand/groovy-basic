package com.behsa.java.generic;

import com.behsa.java.Person;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] integers = {2,5,2,4,5};
        Float[] floats = {2.5f , 4.5543f};
        String[] strings = {"reza", "12", "iran"};
        Util.print(integers);
        Util.print(floats);
        Person p1 = new Person(20, "reza", "ahmadi");
        Person p2 = new Person(25, "javad", "razavi");
        Person p3 = new Person(35, "sara", "razavi");

        if (p1.compareTo(p2) > 0){
            System.out.println( p1 + " is greater");
        }


        Person[] people = {p1,p2,p3};

//        Arrays.sort(people, (a1,a2) -> {});

        String res =  Util.max("ali", "reza", "davood");
        Integer res2 =  Util.max(170, 12, 22);
        Person res3 =  Util.max(p1, p2, p3);

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);

    }
}
