package com.java.homework;

import java.util.Scanner;

public class oddNumbers {
    public static void main(String[] args) {
//        for (int i =1; i <=100; i++) {
//            if (i % 2 == 1) {
//                System.out.println(i);
//            }
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to convert to ASCII:");
        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i++ ) {
            char charInWord = word.charAt(i);
            int ascii = (int) charInWord;
            System.out.print(charInWord + " => " + ascii + "; ");
        }

    }
}
