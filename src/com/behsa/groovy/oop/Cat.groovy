package com.behsa.groovy.oop

import groovy.transform.EqualsAndHashCode
import groovy.transform.PackageScope

class Cat extends Animal{

    @PackageScope
    String ownerName

    @Override
    def move() {
        println "As a Cat I moved"
    }

    @Override
    String toString() {
        return this.name
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
