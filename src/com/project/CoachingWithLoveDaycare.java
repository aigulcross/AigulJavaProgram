package com.project;

import java.util.Scanner;

public class CoachingWithLoveDaycare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter child's name");
        String name = scan.nextLine();
        System.out.println("Enter age:");
        double age = scan.nextDouble();
        int price = 0;
        String childClass = "";
        boolean agreement = false;

        if (age > 1.5 && age <= 6) {
            if (age < 3) {
                childClass = "Star.";
                price = 2000;
            } else {
                childClass = "Sun.";
                price = 1500;
            }
            System.out.println("Daycare fee is " + price + "\nWould you like to apply?");
            agreement = scan.nextBoolean();
            if (agreement) {
                System.out.println("Congratulations! " + name + "is accepted");
                System.out.println(name + "'s class " + childClass);
            } else {
                System.out.println(name + " is not accepted.");
                System.out.println(name + "'s class is " + childClass);
            }
        }else {
            System.out.println("Child " + name + " is not accepted.");
        }

    }
}
