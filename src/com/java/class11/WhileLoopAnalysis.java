package com.java.class11;

import java.util.Scanner;

// 1 2 3 4 5
public class WhileLoopAnalysis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        int i = 1;

        while (i <=limit) {
            System.out.println(i*5);
            i++;
        }
    }
}

