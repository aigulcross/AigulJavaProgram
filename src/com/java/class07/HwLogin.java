package com.java.class07;

import java.util.Scanner;

public class HwLogin {
    public static void main (String [] args) {
        System.out.println("Please enter username & password");
        Scanner sc = new Scanner(System.in);
        String username=sc.nextLine(), password=sc.nextLine();
        String expUsername="Moon", expPassword="Flower";

        if(username == expUsername && password == expPassword) {
            System.out.println("Login Unsuccessful");
        }else if(username!=expUsername && password !=expPassword) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
            }
        }
    }
