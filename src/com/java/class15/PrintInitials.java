package com.java.class15;

public class PrintInitials {
    public static void main(String[] args) {
        String fullName = "Chirag B Khimani"; // C.B.K.
        String [] initials = fullName.split(" ");
        for(int i = 0; i < initials.length; i++)
            System.out.print(initials[i].charAt(0) + ". ");
        
//        System.out.println(initials[0].charAt(0) + ". " + initials[1].charAt(0) + ". " +initials[2].charAt(0) + ".");

    }
}
