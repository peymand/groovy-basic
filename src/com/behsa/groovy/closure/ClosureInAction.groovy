package com.behsa.groovy.closure

import groovy.util.logging.Log

import java.util.function.Consumer



def c = { println "this is simple closure" }
println c.class.name

assert c instanceof Closure

Consumer<String> c1 = (item) -> { println item}
c1.accept("ali")

c()

def sayHello = { name ->
    println "Hello, $name"
}

sayHello 'Groovy'

def str = "sdsadsdsad"
def method =  str.&toUpperCase()

//type
Integer[] arr = [1,2,3,4,5]
def arr2 = []

List nums = [1,4,7,4,30,2]


nums.each { num -> println num}

def timesTen(num , closure){
    closure(num * 10)
}
//method call
timesTen(7) {println it}

10.times { index ->
    index
}

//without arrow token there is a implicit parameter
def foo = { String ... vars ->
    int i = 10
    i++
    vars.join(" ")
}
assert foo() == ""
assert foo('abc', 'reza') == 'abc reza'
assert foo('abc', 'reza', '12345') == 'abc reza 12345'

def someMethod(Closure c){
    println c.maximumNumberOfParameters
    println c.parameterTypes

}

def someClosure = {int x , float y ->
    println x.class.name
    x + y
}
someMethod someClosure
someClosure(3,3.5f)


List favNums = [2,21,44,35,8,4]
for (num in favNums){
    println num
}
favNums.each {println it}

for (int i = 0; i < favNums.size() ; i++) {
    println "$i: ${favNums[i]}"
}

def myClosure = {a,b -> a*b}

favNums.eachWithIndex { entry , index  -> println "$index:$entry" }

List days = ["Sun", "Mon", "Tue", "Wed","Thu" ,"Fri" , "Sat" ]
List weekend = days.findAll { item -> true} //predicate
println weekend

List numList = [1,2,3,6,8,12,3,44]
List numList10 = []

numList.each {item -> numList10 << item * 10}

List newNumList10 = numList.collect { item -> item * 10}

println numList
println numList10
println newNumList10
@Log
class Person{
    String name
    int age


    def study(){
        log.info("this is study")
    }

}

def people = [
        new Person(name: 'ali' , age: 30),
        new Person(name: 'reza' , age: 50),
        new Person(name: 'mahdi' , age: 20)
]
people[0].study()
assert people
        .findAll { it.age < 40}
        .collect {it.name.toUpperCase()}
        .sort()
        .join(", ") == "ALI, MAHDI"

//logging

def log = {String type, Date createdOn , String msg -> println "$createdOn [$type] - $msg"}

log("DEBUG" , new Date() , "in this method i call dummy function from string class")

def infoLog = log.curry("INFO")
infoLog(new Date() , "message")

def someLogMethod = log.rcurry("Fixed Msg")
someLogMethod("Error", new Date())


