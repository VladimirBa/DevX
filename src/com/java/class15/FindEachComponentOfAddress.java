package com.java.class15;

public class FindEachComponentOfAddress {
    public static void main(String[] args) {
        String address = "B604, Cosmos Society, Magarpatta City, Pune, 411013";
        String [] addressA = address.split(", ");
        for(int i = 0; i < addressA.length; i++) {
            System.out.println(addressA[i]);
        }
    }
}
