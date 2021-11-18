package com.behsa.java.io.db;

import com.behsa.java.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
        Statement statement = connection.createStatement();
        ResultSet set = statement.executeQuery("SELECT * from person");
        List<Person>  personList = new ArrayList<>();
        while (set.next()){
            personList.add(new Person(set.getString("name"), set.getString("family")));

        }
        System.out.println(personList);


        Person p = new Person("amin", "javadi");
        PreparedStatement ps = connection.prepareStatement("insert into person (name , family) values (? , ?)");
        ps.setString(1, p.getName());
        ps.setString(2, p.getFamily());
        ps.executeUpdate();


    }

}
