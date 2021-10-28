package com.behsa.groovy.oop

interface Hero {

    def canFight()
    def canFly()
    default String canSwim(){
        "as a Hero i can swim"
    }




}