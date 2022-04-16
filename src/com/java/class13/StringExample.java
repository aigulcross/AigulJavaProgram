package com.java.class13;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");

        if(str1==str2) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
