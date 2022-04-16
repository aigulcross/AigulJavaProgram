package com.java.class11;

import java.util.Scanner;

// 1 4 9 16 25 36
public class WhileLoopAnalyses2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        int i = 1;

        while (i <=limit) {
            System.out.println(i*i);
            i++;
        }
    }
}
