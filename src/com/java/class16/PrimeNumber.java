package com.java.class16;
//Write a program to check given number is prime or not
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number:");
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i =2; i<num; i++) {
            if(num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(num + "is a prime number");
        } else {
            System.out.println(num + "is not a prime number");
        }
    }

}
