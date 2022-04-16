package com.java.class04;

public class StringExamples {
    public static void main(String[] args) {
        int a = 10, b = 20;
        String str1 = "Hello";
        String str2 = "Java";
        System.out.println(a);//10
        System.out.println(a + b);//30
// String + Int or (Int + String) => String always CONCATENATION
        System.out.println(str1 + a + b);//Hello1020
        System.out.println(str1 + " " + str2); //Hello Java
        System.out.println(a + b + str1); //30Hello
        System.out.println(a + str1 + b ); //10Hello20
        System.out.println(str1 +a * b); //Hello200
        //System.out.println(str1 + a - b); //Error
        System.out.println(a - b + str1);// -10Hello
    }
}
