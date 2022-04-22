package com.java.class16;
import java.util.Scanner;

public class FindOccurenceOfChar {
    public static void main(String[] args) {

        System.out.println("Enter any sentence: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = 'a';
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}


