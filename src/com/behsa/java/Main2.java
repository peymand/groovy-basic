package com.behsa.java;

import com.sun.media.sound.InvalidDataException;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.behsa.java.Person.MAX_AGE;
import static java.lang.Math.*;

public class Main2 {

    public static int getYear(String date) throws InputMismatchException  {
        if (date == null || date.length() == 0)
            throw new InputMismatchException("Data is Empty");
        if (date.matches("\\d\\d\\d\\d/\\d\\d/\\d\\d")) {
            String year = date.substring(0, 4);
            int result = Integer.parseInt(year);
            return result;
        } else {
            throw new InputMismatchException("invalid format");
        }
    }

    public static void main(String[] args) {

        getYear("1400/12/12");



    }

    public void calcData(){

    }
}
