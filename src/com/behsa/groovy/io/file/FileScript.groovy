package com.behsa.groovy.io.file

def file = new File("groovy.txt")
file.write("this is from groovy script\n")

//new File("groovy.txt").text = "this is from groovy v2"

file.append("this is appending to file\n")
file.append("this is appending to file\n")
file.append("this is appending to file\n")
file.append("this is appending to file\n")

List lines = file.readLines()
//println lines
lines.each { line ->
    println line

}

new File(".").eachFile { item ->
    if(item.isFile())
        println item.name
}
String dir = "C:/Users/peyma/Java Pack/init-groovy-course"

new File(dir).eachFileRecurse { data ->
    if(data.name.endsWith(".groovy")){
        println data.name
    }

}
println '''
        -------------
        -------------
        -------------
        -------------
        -------------
        '''
List hidden = []

new File(dir).eachFileRecurse { data ->
    if(data.isHidden()){
        hidden << data.name
    }

}

hidden.each { print it}

new File(dir).eachDir { subFolder ->
    println subFolder
    subFolder.size()
}
Scanner scanner = new Scanner(System.in)
def input =  scanner.nextLine()

System.in.withReader {
    reader -> input2 =  reader.readLine()

}
println "your second input is $input2"