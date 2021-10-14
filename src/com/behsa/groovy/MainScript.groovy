package com.behsa.groovy

println 'hello world'
int y = 123 //autoBoxing
y  = y + 12
def x = 123d
println y.getClass().getName()

Person p = new Person()
Person p2 = new Person()

p.setName("ali")
print p.getName()
