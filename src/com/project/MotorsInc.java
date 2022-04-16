package com.project;

import java.util.Scanner;

public class MotorsInc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();
        String result = "";
        if ((vehicleYear >= 2001 && vehicleYear <= 2002) || (vehicleYear >= 2004 && vehicleYear <= 2006) || (vehicleYear >= 2015 && vehicleYear <= 2017)) {
            result = "Your vehicle needs to be recalled!";
        } else {
            result = "Your vehicle is fine, enjoy!";
        }
        System.out.println(result);
    }
}
