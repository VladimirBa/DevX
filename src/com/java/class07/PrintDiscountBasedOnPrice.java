package com.java.class07;

import java.util.Scanner;

// Take num. from user and print discount value based on price
// less 100 => print No discount
// less than 500 => 5%
// less than 1000 => 10%
// more than or equal to 1000 => 15%
public class PrintDiscountBasedOnPrice {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        String str = "";

       if (price < 100) {
           str = "1";
       }else if (price < 500) {
           str = "2";
       }else if (price < 1000) {
           str = "3";
       }else if (price >= 1000) {
           str = "4";
       }

        switch (str) {
            case "1" -> System.out.println("Your discount is 0%.");
            case "2" -> System.out.println("Your discount is 5%.");
            case "3" -> System.out.println("Your discount is 10%.");
            case "4" -> System.out.println("Your discount is 15%.");
        }
    }

}
