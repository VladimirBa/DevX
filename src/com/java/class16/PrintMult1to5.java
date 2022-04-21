package com.java.class16;

public class PrintMult1to5 {
    public static void main(String[] args) {
        int mult = 1;
        for (int i = 1; i <= 5; i++) {
            mult *= i;
        }System.out.println(mult);
    }
}
