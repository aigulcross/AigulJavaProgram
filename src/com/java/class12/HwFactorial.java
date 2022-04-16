package com.java.class12;
// Find the factorial of the number
import java.util.Scanner;
public class HwFactorial {
    public static void main(String[] args) {
        System.out.println("Please enter number to get factorial:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fc = 1;
        for(int i = 1; i <= num; i++) {
            fc = i*fc;
            if (fc<0) {
                System.out.println("Error");
                break;
            }
        }
        if (fc>0) {
            System.out.println(num + "(!) is" + fc );
        }

    }
}
