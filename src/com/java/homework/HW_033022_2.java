package com.java.homework;
//2.  Write a program to get T-shirt size in inches and print size based on inches
//        If inches is 27 to 30 Print XS
//        If inches is 31 to 34 Print S
//        If inches is 35 to 38 Print L
//        If inches is 39 to 42 Print XL
//        If inches is 45 to 50 Print XXL

import java.util.Scanner;

public class HW_033022_2 {
    public static void main(String[] args) {
        System.out.println("Please, enter size of T-shirt:");

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        if (size >= 27 && size <= 30) {
            System.out.println("Size of T-shirt is XS");
        } else if (size <= 34) {
            System.out.println("Size of T-shirt is S");
        } else if (size <= 38) {
            System.out.println("Size of T-shirt is L");
        } else if (size <= 42) {
            System.out.println("Size of T-shirt is XL");
        } else if (size >= 45 && size <= 50) {
            System.out.println("Size of T-shirt is XXL");
        } else {
            System.out.println("You entered wrong size!");
        }


    }
}
