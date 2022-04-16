package com.java.class08;
//Write a program to get T-shirt size in inches and print size based on inches
//If inches is 27 to 30 Print XS
//If inches is 31 to 34 Print S
//If inches is 35 to 38 Print L
//If inches is 39 to 42 Print XL
//If inches is 45 to 50 Print XXL

import java.util.Scanner;

public class HwTshirtSize {
    public static void main(String[] args) {
        System.out.println("Please enter size in inches");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        if (size >= 27 && size <= 30) {
            System.out.println("XS size");
        } else if (size >= 31 && size <= 34) {
            System.out.println("S size");
        } else if (size >= 35 && size <= 38) {
            System.out.println("L size");
        } else if (size >= 39 && size <= 42) {
            System.out.println("XL size");
        } else if (size >= 45 && size <= 50) {
            System.out.println("XXL Size");
        } else {
            System.out.println("Fail");
        }
    }
}
