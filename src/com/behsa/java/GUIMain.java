package com.behsa.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;

public class GUIMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Form");
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton btn1 = new JButton("load data");
        JButton btn2 = new JButton("parse data");
        frame.setLayout(new FlowLayout());





        Runnable r1 = () -> {for (int i = 0; i < 1_000_000_000 ; i++)
                                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");};
        Thread t1 = new Thread(r1);

        btn1.addActionListener(e ->{
            t1.start();

        });

        Runnable r2 = () -> {
                for (int i = 0; i < 1_000_000_000 ; i++) {
                    System.out.println("#######################");
                }

        };

        Thread t2 = new Thread(r2);
        btn2.addActionListener(e ->{
            t2.start();


        });

        frame.add(btn1);
        frame.add(btn2);


        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10 ; i++) {
                    System.out.println(i);
                    System.out.println(Thread.currentThread().getName());
                    try {
                        SecureRandom secureRandom = new SecureRandom();
                        Thread.currentThread().sleep(secureRandom.nextInt(2000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t3 = new Thread(r);
        t3.setName("T3");
        t3.start();

    }
}
