package com.behsa.groovy.oop

class Employee {
    String name
    String family


    static class Info extends Employee{

        int age
        Date dob

    }

    static class Create extends Employee{

    }

    static class Address{
        String streetName
    }
}
