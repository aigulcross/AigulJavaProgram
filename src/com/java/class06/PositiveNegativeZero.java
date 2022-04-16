package coma.java.class06;

import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args){
        System.out.println("Please enter number");

        //Input
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        if(num>0){
            System.out.println("Positive");
        } else if(num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

    }
}
