package com.behsa.groovy.generic

import groovy.transform.ToString

@ToString
class Person implements Comparable<Person> {
    String name
    String family
    int age

    @Override
    int compareTo(Person o) {
        return o.age - this.age
    }

    public static <T extends Comparable<T>> T max(T t1, T t2, T t3){
        T max = t1
        if(t2 > max)
            t2 = max
        if(t3 > max)
            t3 = max
        max
    }
}

def p1 = new Person(name: "ali", family: "ahmadi" , age: 22)
def p2 = new Person(name: "majid", family: "xaberi" , age: 24)
def p3 = new Person(name: "sara", family: "mahdavi" , age: 19)

def arr = [p1, p2,p3]
//Comparator<Person> cmp = { person1 , person2 -> (person1.family > person2.family) ? 1 : -1 }


arr.sort(cmp)

for (Person p  : arr) {
    println p
}
