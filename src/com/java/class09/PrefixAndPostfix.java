package com.java.class09;

public class PrefixAndPostfix {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        int k = i++ + j++;

        int m = k++;



        System.out.println(i);
        System.out.println(j);
        System.out.println(m);
        System.out.println(k);

    }
}
