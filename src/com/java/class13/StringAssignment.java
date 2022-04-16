package com.java.class13;
// Create three String variable & initialize two variables
import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Bank";
        String str2 = "Bank";
        String str3 = sc.nextLine();
        if (str1 == str2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (str1 == str3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (str1.equals(str3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
