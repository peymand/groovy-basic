package com.behsa.groovy.mop

import groovy.time.TimeCategory

class InvokeDemo{

    def prop1 = "prop1"
    def prop2 = "prop2"
    def prop3 = "prop3"

    def invokeMethod(String name, Object args){
        return "called invokedMethod $name $args"
    }

    def getProperty(String name){
        println "in get property method for $name"
        if(metaClass.hasProperty(this, name)){
            return metaClass.getProperty(this, name)
        }else{
            return "nothing found!!!"
        }
    }

    void setProperty(String name, Object value){
        this.@"${name}" = 'something else'
    }


    def test(){
        return "in test method"
    }


    def methodMissing(String name, def args){
        return "dummy"
    }

    def propertyMissing(String name){
        return "caught missing property: $name"
    }

}

def invokeDemo = new InvokeDemo()
assert invokeDemo.test() == "in test method"
//assert invokeDemo.someMethod() == "called invokedMethod someMethod []"
assert invokeDemo.someMethod() == "dummy"
assert invokeDemo.prop1 == "prop1"
assert invokeDemo.prop2 == "prop2"
assert invokeDemo.prop3 == "prop3"
assert invokeDemo.prop4 == "nothing found!!!"

invokeDemo.prop1 = 'dummy'

println invokeDemo.prop1



class Person{

    String first , last

}
Person p = new Person(first: "ali" , last: "ahmadi")
p.metaClass.email = "ali@gmail.com"
println p.email

//class Developer{
//
//}
//Developer.metaClass.writeCode = { -> println "$name loves to code"}
//
//Developer d = new Developer()
//d.metaClass.name = "ali"
//
//d.writeCode()
//
//Developer d2 = new Developer()
//d2.metaClass.name = "reza"
//d2.writeCode()
//
//String.metaClass.shout = { -> toUpperCase()}
//println "reza".shout()
//
//use(StringCategory){
//
//
//
//}

class Developer {

    List languages = []

    def methodMissing(String name, args){

        println "${name}() method was called..."

        if( name.startsWith('write') ) {
            String language = name.split("write")[1]

            if( languages.contains(language) ) {

                metaClass."$name" =  { Object[] theArgs ->
                    println "I like to write code  in $language"
                }
                return impl(args)
            }
        }
    }

}

Developer dan = new Developer()
dan.languages << "Groovy"
dan.languages << "Java"
println dan.metaClass.methods.size()
dan.writeGroovy()

