package com.behsa.java;
@FunctionalInterface
public interface Operation {

    int mul();

    default float div(int a, int b){
        return (float) a/b;
    }

    static int sum(int a , int b){
        return a+b;
    }
}
