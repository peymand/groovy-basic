package com.behsa.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        //data definition
        //Types in java primitive types & Object types
        //8 primitive types int float double byte short long boolean char
        int isDigit = 12;   //myDataIsGettingBack  MyDataIs my_data_is_getting_back  my-data-is kebab case
        float mydata = 12.5f;
        String str = new String("java");
        String str2 = "java";




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


