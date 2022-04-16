package com.project;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Input an alphabet");
        Scanner input = new Scanner(System.in);
        String enteredString = input.next();

        if(enteredString.length() > 1) {
            System.out.println("Input length is longer than 1");
            System.exit( 0);
        }
        char toChar = enteredString.toLowerCase().charAt(0);
        String result = "";

        if (toChar == 'a' || toChar == 'e' || toChar == 'i' || toChar == 'o' || toChar == 'u') {
            result = "Input letter is Vowel";
        }else {
            result = "Input letter is Consonant";
        }
        System.out.println(result);
    }
}
