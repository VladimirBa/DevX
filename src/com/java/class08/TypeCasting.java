package com.java.class08;

public class TypeCasting {
    public static void main(String[] args) {
        //Type Conversion - Int to Double.
        // Widening type casting
        // Implicit type casting = Java will do itself w/o error
        int a = 10;
        double d = a;
        System.out.println(d); // 10.0


        // Type Conversion - Double to Int.
        // Narrowing type casting - some part of data will be lost
        // Explicit Type Casting = User has to put target date type in brackets
        double x = 10.9;
        int y = (int) x;
        System.out.println(y); // 10
    }
}
