package com.java.homework;

import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter up to what number you want to get Fibonacci sequence: ");
//        int fibinacciNumbers = sc.nextInt();
//        fibinacciNumbers = 7;
        int num1 = 0, num2 = 1;
//        System.out.println("Fibonacci Series of "+fibinacciNumbers+" numbers: ");
//
//        for (int i = 1; i <= fibinacciNumbers; ++i)
//        {
//            System.out.print(num1+" ");
//            int sumOfPrevTwo = num1 + num2;
//            num1 = num2;
//            num2 = sumOfPrevTwo;
//        }
//        System.out.println();
//        ////////////////////////////////
//        System.out.println("**************************************");
        int count = 0;
        System.out.println("How many numbers you want in the sequence:");
        count = sc.nextInt();
        System.out.println("Fibonacci Series of "+count+" numbers:");
        int i=1;
        num1 = 0;
        num2 = 1;
        while(i<=count)
        {
            int sumOfPrevTwo = num1 + num2;
            System.out.print(num1+" ");
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }


//        https://codingbat.com/prob/p147448
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int counter = 0;
//        if (str.substring(1, 4).equals("del")) {
//            str = str.replace(str.substring(1, 4), "");
//
//        }
//        System.out.println(str);






            }
        }















