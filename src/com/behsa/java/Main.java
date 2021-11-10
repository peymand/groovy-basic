package com.behsa.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String dataBaseUrl =  args[0];
        String port = args[1];

        System.out.println(args[0]);

        System.out.println(System.getenv(args[0]));

        System.out.println("Hello World");
        //data definition
        //Types in java primitive types & Object types
        //8 primitive types int float double byte short long boolean char
        int isDigit = 12;   //myDataIsGettingBack  MyDataIs my_data_is_getting_back  my-data-is kebab case
        float mydata = 12.5f;
        String str = new String("java");
        String str2 = "java";


        int[] arrx = new int[4];
        arrx[0] = 3;
        arrx[1] = 4;

        int[] arr = {3,4,5,6};

//        String[] texts = {"ali", new String("reza")};
        System.out.println(isDigit);
        int len = str.length();

        int i  = 5;
        int j = 7;

        //wrapper Types
        //Auto Boxing
        Integer item = 12;
        Integer item2 = 12;

        item = item + item2;


        Person p1 = new Person(12 , "ali", "rezaee");
        Person p2 = new Person(12 , "ali", "rezaee");

        if(p1.equals(p2))
            System.out.println(true);



        int i2 = 3;
        int j2 = 7;
        if(i2 > 0 && j2 > 2){

        }

        if(j2 >1){

        }

        Person person = new Person("ali","ahmadi");


    }
}


