package com.behsa.java;

public class Person implements Comparable<Person> {

    public static int MAX_AGE = 120;

    @Override
    public int compareTo(Person o) {
        if(this.age > o.age) return 1;
        else if(o.age > this.age) return -1;
        else return 0;
    }

    public static class Info{
        public int nc;
    }

    //property
    int age;
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

    public Person(){}

    public static void study(){

    }

    public String getName() {
        return name;
    }

    void setName(String name) {

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

    @Override
    public String toString() {
        return String.format("[ %s , %s ]", name, family);
    }
}
