package com.java.homework;

import java.util.Scanner;
/**
 * Online Book Merchants offers premium customers 1 free book with every purchase of 5 or more books
 * and offers 2 free books with every purchase of 8 or more books.
 * It offers regular customers 1 free book with every purchase of 7 or more books
 * and offers 2 free books with every purchase of 12 or more books.
 *
 * Write a program to calculate number of free books.
 *
 *  sample output:
 * Are you a premium customer?
 * true
 * How many books for purchase?
 * 9
 * You qualify for 2 free books
 *
 */
public class TW_042122_BookShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TW_042122_BookShop bookShop = new TW_042122_BookShop();
        System.out.println("Are you a premium customer?");
        boolean isPremiumCustomer = scanner.nextBoolean();
        System.out.println("How many books for purchase?");
        int numberOfBooksPurchased = scanner.nextInt();
        int freeBooks = bookShop.countFreeBooks(isPremiumCustomer, numberOfBooksPurchased );
        System.out.println("You qualify for " + freeBooks + " free books");
    }
    public int countFreeBooks(boolean isPremiumCustomer, int numberOfBooks) {
        //TODO implement method
        if (isPremiumCustomer) {
            if (numberOfBooks >= 5 && numberOfBooks < 8) {
                return   1;
            } else if (numberOfBooks >= 8) {
                return  2;
            }
        }else{
            if (numberOfBooks >= 7 && numberOfBooks < 12) {
                return  1;
            } else if (numberOfBooks >= 12) {
                return  2;
            }
        }return 0;

    }


}

