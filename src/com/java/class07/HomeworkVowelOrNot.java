package com.java.class07;

import java.util.Scanner;

public class HomeworkVowelOrNot {
    public static void main(String[] args) {

        System.out.println("Please Enter any letter:");
        Scanner sc = new Scanner(System.in);

        String letter = sc.nextLine();
        switch (letter) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("This is a vowel letter");
                break;
            default:
                System.out.println("This is not a vowel letter");
        }
    }
}
