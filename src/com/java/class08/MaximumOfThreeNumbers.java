package com.java.class08;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MaximumOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter three numbers to find maximum of them:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Maximum is: " + a);
        }else if (b > c) {
            System.out.println("Maximum is: " + b);
        }else {
            System.out.println("Maximum is: " + c);
        }
    }
}
