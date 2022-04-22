package com.java.homework;

import java.util.Scanner;
/**
 * Write a java program to calculate discount for a product             *
 *  sample output:
 * marked price:
 * 100
 * discount rate:
 * 25
 * amount after discount: 75.0
 */
public class TW_042122_Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TW_042122_Discount discountObj = new TW_042122_Discount();
        //TODO WRITE YOUR CODE HERE
        System.out.println("Enter market price of the good: ");
        double markedPrice = scanner.nextDouble();
        System.out.println("Enter your discount rate: ");
        double discount = scanner.nextDouble();
        double amount = 0;
        discountObj.printMessage(calculateDiscount(markedPrice, discount));
    }

    public static double calculateDiscount(double markedPrice, double discount) {
        return markedPrice * (1 - discount / 100);
    }

    public void printMessage(double message) {
        System.out.println("Amount after discount:" + message);
    }

}
