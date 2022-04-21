package com.java.homework;

import java.util.Scanner;

public class SequenceOfPrimes {
    public static void main(String[] args) {
        System.out.println("Enter only integer positive number up to which you want get sequence of prime numbers ");
        Scanner sc = new Scanner(System.in);
        int upToNumber = sc.nextInt();
        PrimeSequence(upToNumber);
    }

    static void PrimeSequence(int n) {
        int count = 0;
        boolean prime = true;
        System.out.print("The sequence of prime numbers is: ");
        for (int currentNumber = 2; currentNumber <= n; currentNumber++) {
            for (int i = 2; i < currentNumber; i++) {
                if (currentNumber % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(currentNumber + " "); // 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
                count++;

            }
            prime = true;
        }System.out.println("\nThere are " + count + " numbers in the sequence");

    }
}
