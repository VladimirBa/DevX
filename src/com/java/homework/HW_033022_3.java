package com.java.homework;
//3. Write a program to take number from user and check if it's divisible by 5 or 3
import java.util.Scanner;

public class HW_033022_3 {
    public static void main(String[] args) {
        System.out.println("Please, enter number to check its divisible by 3 or 5:");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println((number % 3 == 0 || number % 5 == 0) ?
                "Entered number is divisible by 3 or 5." : "Entered number is not divisible by 3 or 5.");


//        if (number % 3 == 0 || number % 5 == 0) {
//            System.out.println("Entered number is divisible by 3 or 5.");
//        }else {
//            System.out.println("Entered number is not divisible by 3 or 5.");
//        }
    }
}