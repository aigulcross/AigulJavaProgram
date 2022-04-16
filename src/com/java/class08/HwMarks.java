package com.java.class08;
//Write a java program to get marks from users and print grades based on marks (feel free to use any statements)
//If marks are from 90 to 100 Print A
//If marks are from 80 to 89 Print B
//If marks are from 70 to 79 Print C
//If marks are from 60 to 69 Print D
//If marks are from 50 to 59 Print E
//If marks are from 0 to 49 Print Fail
import java.util.Scanner;
public class HwMarks {
    public static void main(String[] args) {
        System.out.println("Please enter any mark");
        Scanner sc = new Scanner(System.in);

        int mark = sc.nextInt();

        if (mark >= 90 && mark <= 100) {
            System.out.println("A");
        } else if (mark >= 80 && mark <= 89) {
            System.out.println("B");
        } else if (mark >= 70 && mark >= 79) {
            System.out.println("C");
        } else if (mark >= 60 && mark >= 69) {
            System.out.println("D");
        } else if (mark >= 50 && mark >= 59) {
            System.out.println("E");
        } else {
            System.out.println("Fail");
        }
    }
}
