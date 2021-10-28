package com.behsa.groovy.oop

import groovy.transform.EqualsAndHashCode
import groovy.transform.PackageScope

class Cat extends Animal{

    @PackageScope
    String ownerName

    def move() {
        println "As a Cat I moved"
    }

    @Override
    String toString() {

        return this.name
    }

    def asBoolean(){
        if(this.name)
            true
        else
            false
    }

    @Override
    boolean equals(Object obj) {
        Cat other = (Cat)obj;
        if(this.name == other.name)
            return true
        else
            return false
    }
}
