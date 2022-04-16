package com.java.class07;

import java.util.Scanner;
public class PrintDiscountBasedOnPrice {
    public static void main(String[] args) {
        System.out.println("Enter any price");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <100){
            System.out.println("No Discount");
        } else if (num <500){
            System.out.println("-5%");
        } else if (num <1000){
            System.out.println("-10%");
        } else if (num >=1000){
            System.out.println("-15%");
        }
    }
}
