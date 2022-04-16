package com.java.class08;

public class EscapeCharacter {
    public static void main(String[] args) {
        System.out.println("Hello \nWorld"); // In new line => \n - as "enter" new row
        System.out.println("\"Hello World\""); // Keep the character "Hello World"

        System.out.println("Hello \t\tWorld"); //TAB Hello        World
        System.out.println("Hello \bWorld"); //Insert backspace  HelloWorld
        System.out.println("Hello \rWorld"); //Insert carriage return  World
        System.out.println("Hello \fWorld"); //Insert form feed Hello World
    }
}
