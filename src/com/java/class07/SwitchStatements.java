package com.java.class07;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {

        System.out.println("Please enter a num:");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 0:
            System.out.println("Zero");
            break; //break divides the numbers btw each other
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");

        }
    }
}