package com.java.class08;

import java.util.Scanner;
import java.util.Scanner;
public class HwPrintLoginStatus {

    public static void main(String[] args) {
        System.out.println("Please enter username & password:");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine(), password = sc.nextLine();
        String expUsername = "Moon", expPassword = "Flower2022";

        // Approach 1

        if (username == expUsername && password == expPassword) {
            System.out.println("Login Successful");
        } else if (username != expUsername && password != expPassword) {
            System.out.println("Login Unsuccessful");
        } else if (username != expUsername && password == expPassword) {
            System.out.println("Invalid username");
        } else {
            System.out.println("Invalid password");
        }
        //Approach 2

        if (username == expUsername) {
            if (password == expPassword) {
                System.out.println("Login successful");
            } else {
                System.out.println("Invalid password");
            }
        } else if (password == expPassword) {
            System.out.println("Invalid username");
        } else {
            System.out.println("Login Unsuccessful");
        }
        //Approach 3
        if (username == expUsername) {
            if (password == expPassword) {
                System.out.println("Login successful");
            } else {
                System.out.println("Invalid password");
            }
        } else if (password == expPassword) {
            System.out.println("Invalid username");
        } else {
            System.out.println("Login Unsuccessful");
        }

    }

}




