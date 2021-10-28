package com.behsa.groovy.oop


//Animal animal = new Animal()
Cat c1 = new Cat(name: 'Fido')
Cat c2 = new Cat(name: 'Fido', age: 12)
assert c1 == c2 // c1.equals(c2)

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

//upcasting
Animal a = new Animal(name: "dummy" ,age:12)
Animal b = new Animal(name: "dummy" ,age:12)
assert a == b   // ---> a.equals(b)
assert a !== "ali"

Cat cat1 = new Cat()
Cat cat2 = new Cat()
Cat cat3 = new Cat()

if(cat3){  // if(cat3.isBoolean())

}

Dog dog1 = new Dog()
Dog dog2 = new Dog()
Object[] animals = [cat1,cat2,cat3,dog1,dog2]

for (Animal item :animals){
    item.move()
}

// is A, Code reuse
f(cat1)
def f(Animal a ){

}

Animal x2 = new Dog()