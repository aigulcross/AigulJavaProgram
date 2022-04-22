package com.java.class16;
import java.util.Scanner;
// WRite a program to take one String from user and find out the number of words we have inside the statement

public class StringPracticeWordCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] parts = str.split( " ");
        System.out.println(parts.length);

        }
    }






