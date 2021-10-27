package com.behsa.groovy.oop

Animal animal = new Animal()
Cat c1 = new Cat(name: 'Fido')
Cat c2 = new Cat(name: 'Fido', age: 12)


c1.move()
println c1.getName()
println c1.toString()

if(c1.equals(c2)){
    println true
}

String str1 = new String("ali")
String str2 = new String("ali")
if(str1.equals(str2)){
    println true
}