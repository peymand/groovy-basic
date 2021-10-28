package com.behsa.groovy.oop

class HeroPerson implements Hero, Person{
    @Override
    def canFight() {
        return null
    }

    @Override
    def canFly() {
        return null
    }

    @Override
    boolean takeRest(int minutes) {
        return false
    }

//    @Override
//    def canSwim() {
//        return ""
//    }
}

