package com.behsa.groovy.oop

//class Bucket{
//    int size
//    int[][] location = new int[3][3]
//    Bucket(int size) {this.size = size}
//    Bucket plus(Bucket other){
//        new Bucket(this.size + other.size)
//    }
//    def moveToRight(){
//        this.location[1][0] = 1
//    }
//}
//
//def b1 = new Bucket(4)
//def b2 = new Bucket(11)
//
//def b3 = b1 + b2 //b1.plus(b2)
//
//def arr = [b1, b2]
//assert arr.contains(b1)
//
//println b1
//
//
//println("Hello world")
def a = ""
def b = false
println b.getClass()
if([] === []) // "".equals(b)
    println("a, ${a} == b, ${b}")
else
    println("a, ${a} != b, ${b}")
