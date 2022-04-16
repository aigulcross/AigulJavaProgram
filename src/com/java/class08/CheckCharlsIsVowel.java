package com.java.class08;

import java.util.Scanner;

//Take single char in the program & check weather given char is vowel or not
//Vowel char are - a,e,i,o,u
public class CheckCharlsIsVowel {
    public static void main(String[] args) {
        System.out.println("Please enter any letter:");
        Scanner sc = new Scanner(System.in);

        char c = 'A';
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Vowel");
        }else{
            System.out.println("Not vowel");
        }
    }
}

