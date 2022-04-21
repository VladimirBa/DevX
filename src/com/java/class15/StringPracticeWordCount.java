package com.java.class15;

import java.util.Scanner;

public class StringPracticeWordCount {
    public static void main(String[] args) {
        System.out.println("Enter any sentence: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int counter = 0;
        String [] words = str.split(" ");
        System.out.println(words.length);
//        for (int i = 0; i < words.length; i++) {
//            counter++;
//        }
//        System.out.println(counter);
    }
}
