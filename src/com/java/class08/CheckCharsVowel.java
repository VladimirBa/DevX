package com.java.class08;

import java.util.Scanner;

// Take single in the program & check weather given char is vowel or not (a, e, i, o, u)
public class CheckCharsVowel {
    public static void main(String[] args) {
        System.out.println("Enter any character: ");
        Scanner sc = new Scanner(System.in);
        String character = sc.nextLine();

        if (character.equals("a") || character.equals("e") || character.equals("i")
                || character.equals("o") || character.equals("u")) {
            System.out.println("Entered character is vowel.");
        } else {
            System.out.println("Entered character is not vowel.");
        }
    }

}

