package com.java.class17;

//Write a program to find out divisor of given number

import java.util.Scanner;
public class HW {
    public static void main(String[] args) {

        System.out.println("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i ==0) {
                System.out.println(i);

            }

        }
    }
}
