package com.java.class07;

public class RevisionQ2 {
    public static void main(String[] args) {
        int a=55;

        if(a%10>6){ //false
            System.out.println("1");
        }else if (a%10<6){
            System.out.println("2"); //true
        }else if (a%10==5){
            System.out.println("3");
        }else{
            System.out.println("4");
            //if one is true already it will not check another statements
        }
    }
}
