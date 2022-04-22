package com.java.class14;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to DevX!";

        //1. We want to check equality of Two String
        System.out.println(str1.equals(str2));

        //2. Check equality of two String ignoring case
        System.out.println(str1.equalsIgnoreCase(str2));

        //3. Check one String contains another String
        System.out.println(str1.contains(str3));
        System.out.println(str3.contains(str1));

        String str3LowerCase = str3.toLowerCase();
        String str2LowerCase = str2.toLowerCase();

        System.out.println("3.1 Contains: " + str3LowerCase.contains(str2LowerCase));

        //4. Changing the case of String
        System.out.println("4. Upper Case: " + str3.toUpperCase());
        System.out.println("4. Lower Case: " + str3.toLowerCase());

        //5. Find index of character
        str1 = "Hello World";
        System.out.println("5. Index Of Char: " + str1.indexOf('W'));
        System.out.println("5. Last Index Of Char: " + str3.lastIndexOf('l'));

        //6. Find character at Index
        str1 = "Hello World";
        System.out.println("6. Index Of Char: " + str1.charAt(0));

        //7. Length of String
        str1 = "Hello World";
        str3 = "Hello World! Welcome to DevX!";
        System.out.println("7. Length Of String " + str1.length());
        System.out.println("7. Length Of String " + str3.length());

        //8. Empty and Blank
        str1 = "          ";
        str3 = "d";
        System.out.println("8. Empty: " + str1.isEmpty());
        System.out.println("8. Empty: " + str3.isEmpty());
        System.out.println("8. Blank: " + str1.isBlank());
        System.out.println("8. Blank: " + str3.isBlank());

        //9. Replace & ReplaceAll
        str1 = "Welcome user";
        str3 = "DevX";
        System.out.println("9. Replace: " + str1.replace("User", str3));

        // 10. Format
        str1 = "Welcome %s";
        System.out.println("10. Format: " + String.format(str1, "Aigul"));

        // 11. Substring
        str1 = "Welcome to java class. Today is fun day";
        System.out.println("11. SubString: " + str1.substring(7));
        System.out.println("11. Substring: " + str1.substring(0,5));

        // 12. Split
        str1 = "Welcome to java class. Today is fun day";



        String[] words = str1.split(" ");

        // Find length of String
        System.out.println(str1.length());

        for (int i = 0; i < 3; i++) {
            System.out.println(words.length);
        }
        System.out.println("12. Split: " + words[0] + words[1] + words[2] + words[3]);
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);


    }
}