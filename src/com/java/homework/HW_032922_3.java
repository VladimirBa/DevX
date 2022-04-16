package com.java.homework;

import java.util.Scanner;

public class HW_032922_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Username: ");
        String username = sc.nextLine();
        System.out.println("Enter your Password: ");
        String password = sc.nextLine();

        String _username = "Vova";
        String _password = "12345";

//        System.out.println((_username.equals(username)) ?
//                ((_password.equals(password)) ?
//                "Login successful" : "Invalid password") :
//                ((_password.equals(password)) ?
//                "Invalid username" : "Login unsuccessful"));


        if (_username.equals(username)) {
            System.out.println((_password.equals(password)) ? "Login successful" : "Invalid password");
        }else{
            System.out.println((_password.equals(password)) ? "Invalid username" : "Login unsuccessful");
        }
    }
}

