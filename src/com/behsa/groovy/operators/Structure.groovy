package com.behsa.groovy.operators

import static java.lang.Math.abs

//java.lang
//java.util
//groovy.lang
//groovy.util
//java.io
//java.net

//package

def x = 1
println x
x++
def y = 'groovy'
z = "${x + 1} $y"
println z

def (a, b, c) = [10, 20, 'bar']

assert a == 10 && b == 20 && c == 'bar'

def (int i, String j) = [10, 'foo']

def arr = [1, 2, 3, 2]
def str = "in day of 21 we buy 100 things"
arr = str.split("[0-9]+")
for (count in arr) {
    println count
}
def (_, month, year) = "21st Oct 2021".split(" ")
assert "In $month of $year" == 'In Oct of 2021'

def (a1, b1, c1) = [1, 2]
assert a1 == 1 && b1 == 2 && c1 == null

(a1, b1) = [1, 2, 3]
assert a1 == 1 && b1 == 2

class Location {

    double lat
    double lon

    double getAt(int index) {
        if (index == 0)
            lat
        else if (index == 1)
            lon
        else null
    }

}

def myLoc = new Location(lat: 44.52, lon: 33.61)

def (la, lo) = myLoc // --> [ 44.52 , 33.61]

assert la == 44.52 && lo == 33.61


// switch case

Scanner scanner = new Scanner(System.in)
x = 120
def result = ""
switch (x) {

    case 'foo':
        result = "foo found"
    case "bar":
        result += "bar"
    case [4 ,10 , 12, 'inList']:
        result+= "List"
        break
    case Integer:
        result = "integer"
        break
    case 100:
        result+="dummy"
    default:
        result = "default"

}

//for (i3 in arr) {
//    if(i3 > 50)
//        break
//}
//do{
//    String input = scanner.next()
//    if(input == "exit")
//        break
//} while (true)

println result

def facts = []
def count = 5
for (int fact = 1 , o =1 ; o <= count ; fact*=o) {
    facts << fact
}
assert facts == [1,2, 6 , 24, 120]

int d = 3; //0b00010000
int res = d << 2;