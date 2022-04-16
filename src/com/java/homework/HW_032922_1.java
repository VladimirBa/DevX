package com.java.homework;

import java.util.Scanner;

public class HW_032922_1 {
    public static void main(String[] args) {
        System.out.println("Enter name of the product: ");
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();

        switch (product) {
            case "Hangouts" :
            case "Outlook" :
            case "Skype" :
                System.out.println("This product made by \"Microsoft\".");
                break;
            case "Watsapp" :
                System.out.println("This product made by \"Facebook\".");
                break;
            case "Gmail" :
            case "Youtube" :
                System.out.println("This product made by \"Google\".");
                break;
            default:
                System.out.println("Answer was not found.");
        }
    }
}
