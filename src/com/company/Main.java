package com.company;

import java.awt.*;
import java.util.Arrays;
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
//        System.out.println(message.length());
//	    System.out.println("I am a Developer!");
//        System.out.println(age);
//        System.out.println(newAge);
//        System.out.println(message + " Welcome");

	    //Reference Types: date,


        Date todayTime = new Date();
//        System.out.println(todayTime);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 33;
//        System.out.println(point2);

        //Cfreating a Array
        //Old way of using Array
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[9] = 2;
//        System.out.println(numbers);
//
//        System.out.println(Arrays.toString(numbers));


        //New way of using array!


        int[] newNumbers = {2,3,5,1,4,9};
        Arrays.sort(newNumbers);
        System.out.println(newNumbers);
        System.out.println(Arrays.toString(newNumbers));

    }
}
