package com.java.homework;

import java.util.Scanner;

public class HW_041922_PrimeNum {
    public static void main(String[] args) {
        System.out.println("Enter any number to check if it is prime number ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String prime = " is prime";
        if (number == 1) {
            prime = prime;
        }else if (number < 1) {
            prime = " is wrong number. Prime number can be only integer positive number!";
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = " is not prime";
                break;
            }
        }
        System.out.println("Given number " + number + prime);
        //////////////////////////////////////
        for (int i = 2; i < number; i++)
            if (number % i == 0) {
                prime =" is not prime";
                break;
            }else{
                prime = " is prime";
            }
        System.out.println("Given number " + number + prime);

    }
}
