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
assert !false & false


//short circuiting