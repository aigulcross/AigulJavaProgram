package com.java.class07;

import java.util.Locale;
import java.util.Scanner;

public class HomeworkGoogleFacebookMicrosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Program Name:");

        String FindCompany = sc.nextLine().toLowerCase();
        switch (FindCompany) {
            case "gmail":
            case "youtube":
            case "hangouts":
                System.out.println("Google");
                break;
            case "whatsapp":
                System.out.println("Facebook");
                break;
            case "skype":
            case "outlook":
                System.out.println("Microsoft");
        }
    }
}
