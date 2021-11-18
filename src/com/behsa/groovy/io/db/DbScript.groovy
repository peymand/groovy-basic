package com.behsa.groovy.io.db

import com.behsa.java.Person
import groovy.sql.Sql

def sql = Sql.newInstance("jdbc:mysql://localhost:3306/test", "root", "123456","com.mysql.cj.jdbc.Driver")
sql.eachRow('SELECT * from Person') { row ->
    println "Person: [ ${row.name} , ${row.family}]"
}

def p = new Person("akbar","ahmadi")

sql.execute """

    INSERT INTO PERSON (NAME, FAMILY)
    VALUES 
    (${p.name} , ${p.family})

"""


sql.close()
println "completed!!"