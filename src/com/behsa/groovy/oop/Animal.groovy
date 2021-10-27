package com.behsa.groovy.oop

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Animal {

    String name
    int age

    def move(){ //varArags
        println "As a animal I Moved"
    }

}
