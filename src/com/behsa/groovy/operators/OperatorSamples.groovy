package com.behsa.groovy.operators

import groovy.transform.EqualsAndHashCode

//arithmetic operator
assert 1 + 1 == 2
assert 1 * 2 == 2
assert 1 - 1 == 0
assert 3 / 2 == 1.5
assert 10 % 3 == 1
assert 3 ** 2 == 9  //no in java

//unary operator

assert +10 == 10
assert -10 == 0-10
assert -(-10) == 10

// ++ , -- post/ pre increment  post / pre decrement

def alpha = 2
def beta = alpha++ * 3

assert alpha == 3 & beta == 6

def c  = 3
def d = c-- * 2
assert  c == 2 && d == 6

def e = 1
def f = ++e + 3
assert e == 2   & f == 5

def g  = 4
def h = --g + 1
assert g == 3  & h == 4

//assignment arithmetic += *= and etc

def a = 4
a+=3
assert a == 7
a-=4
assert a == 3
a*=2
assert a == 6

//Relational operators == equal != different < less than > greater than === identical !== not identical

assert  1+2 == 3
assert 3 != 4
assert -2 < 3
assert 2 <= 2
assert 3 <= 4
assert 5 > 1
assert 5 >=-2
@EqualsAndHashCode
class Creature {
    String type
}

def cat = new Creature(type: 'cat')
def copyCat = cat
def lion = new Creature(type: 'cat')

assert cat.equals(lion) // java style equality check
assert cat == lion
assert cat.is(copyCat)
assert cat === copyCat
assert cat !== lion

//logical operators && || ! & | ampersand pipe not

assert !false
assert true && true
assert true || false
assert !(false & false)   //short circuiting

//bitwise and bitshift & | ^ ~

int data = 0b00101010
assert data == 42
int secondData = 0b00001000  // 0*2^0 + 0*2^1 + 1*2^3
assert secondData == 8

assert  ( data & data) == data
assert  ( data & secondData) == secondData
assert  ( data | data) == data
assert  ( data | secondData ) == data
int mask = 0b11111111
        //11010101 & 11111111
assert  ( (~data) & mask ) == 0b11010101

//  ! this is not operator vs ~ this is bitwise negation

a = '' //groovy truth
b = !a
assert b
a = 2
assert !a == false

//Ternary Operator
String dummy = "ali"
String result
if( dummy ){
    result = 'found'  //Gstring
}else{
    result = 'not found!!'
}
result = ( dummy !=null && dummy.length() >0 ) ?  'found'   : 'not found'
result = dummy  ?  'found'   : 'not found'

//Elvis operator
result = dummy  ?  dummy   : 'not found'
result = dummy  ?: 'not found'

assert result == 'ali'


x = 100
text = "my money is $x" //Gstring enables placeholder through dollar sign

assert text == 'my money is 100'

//direct field access
class Person{

    String name;
    int age
    public Person(String str){
        this.name = str
    }
    public String getName() {

        "Name : $name"
    }
    String call(int i){
        "this is something"
    }
}

def person = new Person(name: "ali" , age: 12)


user = new Person('Bob')
// user.name == Bob
assert user.getName() == 'Name : Bob'

assert user.@name == 'Bob'



//method pointer

def str = 'groovy is a programming language'
def dummyMethod = str.&toUpperCase
def dummyMethod2 = user.&getName

res =  dummyMethod()

assert res == 'GROOVY IS A PROGRAMMING LANGUAGE'
assert dummyMethod2() == 'Name : Bob'

// .. Range
def range = 10..5

for (i in 0..<5){
    println i
}
assert !null
def sample = null
res = sample ?: 123
println res

//call operator
def mx = new Person("ali")
def xyz =  mx 4
assert(mx(4) == "this is something")

//[] subscript

//operator overloading
class Bucket{

    int size

    Bucket(int size) {this.size = size}

    Bucket plus(Bucket other){
        new Bucket(this.size + other.size)
    }


    Bucket plus(Integer other){
        new Bucket(this.size + other)
    }

    Bucket minus(Bucket other){
//        if(this.size < other.size)
//            new Bucket(0)
//        else
//            new Bucket(this.size - other.size)

        new Bucket(Math.abs(this.size - other.size))
    }

    Bucket next(){
        new Bucket(++this.size )
    }

    Bucket previous(){
        new Bucket(--this.size )
    }

}

def b1 = new Bucket(4)
def b2 = new Bucket(11)
//post increment
b5 =  b1++
def b3 = b1 + 10 //b1.plus(b2)
def b4 = b1 - b2 //b1.minus(b2)
assert b3.size == 15
assert b4.size == 0
assert b5 == b1.size + 1
def r =  b1..b5

