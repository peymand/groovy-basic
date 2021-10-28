package com.behsa.groovy.oop

import groovy.transform.PackageScope


class  Animal { //Plain old groovy Object POGO

    @PackageScope
    String name
    int age


//    def abstract move();

    @Override
    boolean equals(Object obj) {
        Animal  caller  = this
        Animal x = obj
        if(obj instanceof Animal){
            Animal argument = (Animal)obj
            if(this.name == argument.name)
                return true
            else
                return false
        }else{
            return false
        }


    }
}
