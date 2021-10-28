package com.behsa.groovy.oop

class Student implements Person {

    @Override
    boolean takeRest(int minutes) {
        if (minutes < 0)
            false
        else
            true
    }
}
