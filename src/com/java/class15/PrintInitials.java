package com.java.class15;

// Take Full name from User nd print Initials of it
public class PrintInitials {
    public static void main(String[] args) {
        String fullName = "Aigul Cross"; // A.C.
        String parts[] = fullName.split( " ");

        String firstName = parts[0];
        String lastName = parts [1];

        System.out.println(firstName.charAt(0) + "."
        + lastName.charAt(0) + ".");

    }
}
