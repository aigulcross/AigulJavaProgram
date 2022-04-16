package com.java.class07;

//Take one number from User and print number in text format

import java.util.Scanner;

//Example input - 1, output - One
//Example input - 7, output - Seven
public class PrintNumberInTextAssignment {
    public static void main(String[] args) {
        System.out.println("Enter any number from 0 to 9:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Zero");
            if (num == 1) {
                System.out.println("One");
            } else if (num == 2) {
                System.out.println("Two");
            } else if (num == 3) {
                System.out.println("Three");
            } else if (num == 4) {
                System.out.println("Four");
            } else if (num == 5) {
                System.out.println("Five");
            } else if (num == 6) {
                System.out.println("Six");
            } else if (num == 7) {
                System.out.println("Seven");
            } else if (num == 8) {
                System.out.println("Eight");
            } else if (num == 9) {
                System.out.println("Nine");
            }
        }
    }
}
