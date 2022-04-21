package com.java.homework;

import java.util.Scanner;

public class HW_041922_Divisors {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotally " + count + " divisors");




    }
}
