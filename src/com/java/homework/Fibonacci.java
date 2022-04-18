package com.java.homework;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = 1, num2 = 1;
        int count = 0, i = 1;
        System.out.println("How many numbers do you want in the Fibonacci sequence?");
        count = sc.nextInt();
        System.out.println("Fibonacci sequence of " + count + " numbers:");
        while (i <= count) {
            long sumOfPrevTwo = num1 + num2;
            System.out.print(num1 + " ");
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
        double goldenRatio = (double) num2 / num1;
        System.out.printf("\nGolden ratio for this sequence is: %.6f", goldenRatio);
        System.out.println("\n*************************************************************************");
        System.out.println("What a maximum number  do you want to get Fibonacci sequence up to?");
        int upToNum = sc.nextInt();
        long num3 = 1, num4 = 1;
        System.out.println("Fibonacci sequence up to number " + upToNum + " numbers:");
        while (num3 <= upToNum) {
            long sumOfPrevTwo = num3 + num4;
            System.out.print(num3 + " ");
            num3 = num4;
            num4 = sumOfPrevTwo;
            i++;
        }





    }
}















