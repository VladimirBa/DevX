package com.java.homework;

import java.util.Scanner;

public class HW_032922_2 {
    public static void main(String[] args) {
        System.out.println("Enter character to check if it is vowel: ");
        Scanner sc = new Scanner(System.in);
        String character = sc.nextLine();

        switch (character) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Entered character is vowel.");
                break;
            default:
                System.out.println("Entered character is not vowel.");
        }
    }
}
