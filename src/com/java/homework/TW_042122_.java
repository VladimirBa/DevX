package com.java.homework;

public class TW_042122_ {
    public static void main(String[] args) {
        // String is IMMUTABLE:
        String s = "java";
        s.concat("Python");
        System.out.println(s); // java

        // String POOL:
        String ss = "java";
        System.out.println(s == ss); // java As s and ss have the same value (java) their location is the same.
                // Java first compare values and if these are the same put them to one location in pool memory -
                // does not create new memory location.
        System.out.println(s == "java"); // java
    }
}
