package com.behsa.java;

public class Person {


    //property
    private int age;
    private String name;
    private String family;

    public Person(int age , String name, String family){ //initialization object
        this.age = age;
        this.name = name;
        this.family = family;
    }

    public Person(String name , String family){
        this.name = name;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public boolean equals(Object obj) {
        Person arg = (Person) obj;
        if(this.age == arg.age && this.name.equals(arg.name) && this.family.equals(arg.family))
            return true;
        else
            return false;
    }
}
