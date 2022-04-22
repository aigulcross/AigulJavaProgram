package com.java.class16;
import java.util.Scanner;
//Write a program to take one String from user and print reverse of it

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));


        }
    }
}
