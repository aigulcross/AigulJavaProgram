package com.java.class16;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello";

        //Strung buffer uses the buffer mechanism to protect data from being access and update simultaneously so it's
        // thread-safe

        StringBuffer sbuffer = new StringBuffer("Hello");
        sbuffer.reverse();

        //String builder doesn't have buffer mechanism, so it's faster than StringBuffer



        StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.reverse();
    }
}
