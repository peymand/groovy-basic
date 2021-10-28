package com.behsa.groovy.oop

import java.lang.reflect.Method
import java.util.function.Consumer

def hero = new HeroPerson()
assert "as a Hero i can swim" == hero.canSwim()

int result = 100

Operation op = new MyOperation()
assert 10 == op.sum(5, 5)

Operation op1 = (i, j) -> i + j + result

assert op1.sum(2,3) == 105

def closure = { e -> println "this is $e" }
def code = { () -> 1000 }
println code.getClass().name
assert code() == 1000
assert code.call() == 1000
Consumer<String> c2 = {i -> println "$i"}
//c2("ali")

HeroPerson hp = new HeroPerson()
Class x =  hp.getClass()
x = HeroPerson.class
println x.getName()

//reflection
f(hp)
f("")
f(12)
f(Integer.class)
def f(Class arg){
     Class cls =  arg.class
    Method[] methods =  cls.getMethods()
    for (Method method : methods) {
        if(method.name.contains("go"))
            method.invoke(arg)
    }
}