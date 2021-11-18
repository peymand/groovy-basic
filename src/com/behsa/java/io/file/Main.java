package com.behsa.java.io.file;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("sample.txt");
        FileWriter writer = new FileWriter(file, true);
        writer.append("\n this is groovy class \n");
        writer.close();


        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        br.readLine();
        Scanner scanner = new Scanner(file);

    }

}
