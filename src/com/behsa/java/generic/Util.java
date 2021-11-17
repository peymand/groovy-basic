package com.behsa.java.generic;

import com.behsa.groovy.oop.Hero;
import com.behsa.groovy.oop.Hero2;

import java.util.Comparator;

public class Util {

    //compile time type safety
    //Type definition section
    public static <T extends Number> void print(T[] arr){
        for (T item : arr) {
            System.out.println(item);
        }
    }



    public static <T extends Comparable<T>> T max(T t1, T t2, T t3){
        T max = t1;
        if(t2.compareTo(max)> 0){
            max = t2;
        }
        if(t3.compareTo(max) > 0){
            max = t3;
        }
        return max;
    }


}
