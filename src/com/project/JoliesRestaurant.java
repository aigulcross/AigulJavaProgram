package com.project;

import java.util.Scanner;

public class JoliesRestaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Jolie's Restaurant!!!");
        System.out.println("Please enter number of guests:");
        int numberOfGuests = scanner.nextInt();
        System.out.println("Please enter a bill amount:");
        double billAmount = scanner.nextDouble();
        int taxFeePercent = 10;
        System.out.println("Would you like to split a bill?");
        boolean isSplit = scanner.nextBoolean();
        System.out.println("How did you like our service? (Options: bad-10%, not bad-15 %, good-20%, great-25%)");
                scanner.nextLine();
        String serviceQuality = scanner.nextLine();
        double totalAmount;
        double tipPercentage = 0;
        switch (serviceQuality) {
            case "bad": tipPercentage = 10;
            break;
            case "not bad": tipPercentage = 15;
            break;
            case "good": tipPercentage = 20;
            break;
            case "great": tipPercentage = 25;
            break;
        }
        totalAmount = billAmount * (1 + tipPercentage / 100) * (1 + taxFeePercent / 100.0);
        double totalAmountPerGuest = totalAmount / numberOfGuests;
        if (isSplit) {
            System.out.println("Finally, number of guests: " + numberOfGuests + ". Total per guest: " + totalAmountPerGuest);
        } else {
            System.out.println("Finally, number of guests: " + numberOfGuests + ". Total amount: " + totalAmount);
        }
    }
}
