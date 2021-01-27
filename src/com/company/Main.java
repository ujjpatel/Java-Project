package com.company;

import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Primitive Types : Number, byte. short, int, long, float, double, char, boolean
        byte age = 24;
        byte newAge = age;
        age = 26;
        int viewsCount = 1_000;
        float interestRate = 22.45f;
        char name = 'A';
        boolean isOnline = true;
        String message = "Hello";
        System.out.println(message.length());

	    System.out.println("I am a Developer!");
        System.out.println(age);
        System.out.println(newAge);
        System.out.println(message + " Welcome");

	    //Reference Types: date,


        Date todayTime = new Date();
        System.out.println(todayTime);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 33;
        System.out.println(point2);
    }
}
