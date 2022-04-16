package coma.java.class06;

import java.util.Scanner;

//Write a program when user enter any number from 0-6
//print days of week
//0-Sunday,1-Monday,2-Tuesday,3-Wednesday,4-Thursday,5-Friday,6-Saturday
public class LadderIfElseExample {

    public static void main(String[] args) {
        //Input
        System.out.println("Enter any number from 0 to 6:");
        Scanner sc = new Scanner(System.in);
        int dayNum=sc.nextInt();

        if(dayNum==0){
            System.out.println("Sunday");
        }else if(dayNum==1){
            System.out.println("Monday");
        }else if(dayNum==2){
            System.out.println("Tuesday");
        }else if(dayNum==3){
            System.out.println("Wednesday");
        }else if(dayNum==4){
            System.out.println("Thursday");
        }else if(dayNum==5){
            System.out.println("Friday");
        }else if(dayNum==6) {
            System.out.println("Saturday");


            //Output
            System.out.println("Sunday");
            System.out.println("Monday");
            System.out.println("Tuesday");
            System.out.println("Wednesday");
            System.out.println("Thursday");
            System.out.println("Friday");
            System.out.println("Saturday");
        }
    }
}
