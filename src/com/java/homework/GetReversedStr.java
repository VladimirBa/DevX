package com.java.homework;
import java.util.Scanner;
public class GetReversedStr {

// Write a program to check given String is palindrome or not
        public static void main(String[] args) {
            // Take String from user
            System.out.println("Enter a word to check if it is palindrome: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            // Find Reverse of Given String
            String rev = getReverse(str);

            // Compare Rev with original String to check if palindrome
            if(str.equals(rev)){  // or => if(str.equals(getReverse(str))){
                System.out.println("It's palindrome");
            }else{
                System.out.println("Not palindrome");
            }
        }
        // This method will find reverse of given String
        static String getReverse(String str){
            String rev = "";

            for(int i=str.length()-1; i>=0; i--){
                rev = rev + str.charAt(i);
            }
            return rev;
        }


    }

