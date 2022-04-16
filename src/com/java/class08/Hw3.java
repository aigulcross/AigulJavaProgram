package com.java.class08;
//Write a program to take number from user and check if it's divisible by 5 or 3
import java.util.Scanner;
public class Hw3 {
    public static void main(String[] args) {
        System.out.println("Please enter any number:");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("Number is divisible by 5 and 3");
        } else if (num % 5 == 0) {
            System.out.println("Number is divisible by 5");
        } else if (num % 3 == 0) {
            System.out.println("Number is divisible by 3");
        } else {
            System.out.println("Fail");
        }
    }
}
