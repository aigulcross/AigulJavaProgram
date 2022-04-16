package com.java.class07;

//Take one number (Marks) from User(Keyboard)
//90 to 100 then print Grade A
//80 to 89 then print Grade B
//70 to 79 then print Grade C
//60 to 69 then print Grade D
//50 to 59 then print Grade E
//0 to 49 then print Grade Fail

import java.util.Scanner;

public class LadderIfElseWithLogicalOperatorAssignment {
    public static void main(String[] args) {

        System.out.println("Enter any number from 0 - 100:");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 90 - 100) {
            System.out.println("Grade A");
        } else if (num == 80 - 89) {
            System.out.println("Grade B");
        } else if (num == 70 - 79) {
            System.out.println("Grade C");
        } else if (num == 60 - 69) {
            System.out.println("Grade D");
        } else if (num == 50 - 59) {
            System.out.println("Grade E");
        } else if (num == 0 - 49) {
            System.out.println("Grade Fail");

        }
    }
}
