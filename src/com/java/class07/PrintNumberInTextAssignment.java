package com.java.class07;

// Take 1 num. (0 - 9) from user

//Example input - 1, otput - One
//Example input - 7, otput - Seven

import java.util.Scanner;

public class PrintNumberInTextAssignment {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("ZERO.");
        } else if (number == 1) {
            System.out.println("ONE.");
        } else if (number == 2) {
            System.out.println("TWO.");
        } else if (number == 3) {
            System.out.println("THREE.");
        } else if (number == 4) {
            System.out.println("FOUR.");
        } else if (number == 5) {
            System.out.println("FIVE.");
        } else if (number == 6) {
            System.out.println("SIX.");
        } else if (number == 7) {
            System.out.println("SEVEN.");
        } else if (number == 8) {
            System.out.println("EIGHT.");
        } else if (number == 9) {
            System.out.println("NINE.");
        }
        else{
            System.out.println("Invalid input. Please, enter number from 0 to 9.");
        }
    }

}
