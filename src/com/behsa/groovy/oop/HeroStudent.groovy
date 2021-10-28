package com.behsa.groovy.oop

class HeroStudent2  extends Student implements Hero{
    @Override
    def canFight() {
        return null
    }

    @Override
    def canFly() {
        return null
    }

}

HeroStudent2 z = new HeroStudent2()
Student x = z
Person x2 = z
Hero x3 = z
