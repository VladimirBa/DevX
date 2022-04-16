package com.java.class14;

import javax.sound.midi.Soundbank;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to Devx!";
        //1. Check equality of 2 string
        System.out.println(str1.equals(str2)); // false
        //2. Check equality of 2 string ignoring case
        System.out.println(str1.equalsIgnoreCase(str2)); // true
        //3. Check if one string contains another string
        System.out.println(str1.contains(str3)); // false
        System.out.println(str3.contains(str1)); // true
        System.out.println(str3.contains(str2)); // false
        System.out.println(str2.toUpperCase()); // false

        System.out.println("1" + str3.toLowerCase().contains(str2.toLowerCase()));
        //4. Changing the case of the string
        System.out.println(str3.toUpperCase()); // HELLO WORLD! WELCOME TO DEVX!
        System.out.println(str3.toLowerCase()); // hello world! welcome to devx!
        //5. Find index of the character
        System.out.println("eee" + str1.indexOf('W')); // 6
        System.out.println("eee " + str3.lastIndexOf('W')); // 13
        //6. Find character at index
        System.out.println(str1.charAt(3) + "\n===================="); //l
        //7. 8. Length of the string. Empty and blank
        str1 = "              ";
        str2 = "Hello World";
        str3 = "";
        System.out.println(str2.length() + "\n===================="); // 11
        System.out.println(str1.isBlank() + "\n===================="); // true
        System.out.println(str1.isEmpty() + "\n===================="); //false
        System.out.println(str1.length() + "\n===================="); //14
        System.out.println(str3.length() + "\n===================="); //0
        System.out.println(str3.isBlank() + "\n===================="); // true
        System.out.println(str3.isEmpty() + "\n===================="); // true

        // 9. Replace &ReplaceAll
        str1 = "Welcome User 111 User 222 User 333";
        str2 = "Hello World";
        str3 = "Devx";

        str1 = "INR 200 INR 300 INR 500 inr 777";
        System.out.println(str1.replace("User", str3)); // Welcome Devx
        System.out.println(str1.replace(str1, str3)); // Devx
        System.out.println(str1.replace("User 222", "World 222!"+ "\n===================="));
                                    // Welcome User 111 World 222! User 333
        System.out.println("9. Replace all: " + str1.replaceAll("[a-zA-Z]", "-")); //  --- 200 --- 300 --- 500 --- 777
        System.out.println("9. Replace all: " + str1.replaceAll("[0-9]", "*"));// INR *** INR *** INR ***


        //10. Format
        String str4 = "Welcome %s. Welcome to %s";
        System.out.println(String.format(str4,"Chirag", "Ebay"));

        // 11. Substring
        String str6 = "Welcome to java class. Today is a fun day.";
        System.out.println("11. Substring: " + str6.substring(7)); //to java class. Today is a fun day. Stars from index 7
        System.out.println("11. Substring: " + str6.substring(3, 7)); // come => Last index excluded

        //12. Split
        String str5 = "Welcome to java class";
        String [] words = str5.split(" ");
        System.out.println(words.length);
        System.out.println("12. Split: " + words[1]);
        for (String word : words) {
            System.out.println(word);
        }

        //13. Trim
        str5 = "     test      ";
        System.out.println("13. Trim: " + str5.trim());











    }
}
