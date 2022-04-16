package com.java.class07;

//Take month name from User and print number of days in given month


import java.util.Locale;
import java.util.Scanner;

public class PrintNumberOfDayInMonthUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Please enter a month: ");

            String month = sc.nextLine().toLowerCase();

            switch (month) {
                case "january":
                case "march":
                case "may":
                case "july":
                case "august":
                case "october":
                case "december":
                    System.out.println("31 days");
                    break;
                case "february":
                    System.out.println("28-29 days");
                    break;
                case "april":
                case "june":
                case "september":
                case "november":
                    System.out.println("30 days");
                    break;

            }
        }
  }