package com.java.class04;

public class StringExample {
    public static void main(String[] args) {
        //If we do addition with String it'll be concatenation
        //String + String = StringString
        //String + Int = StringInt
        //Int + String = IntString (concatenation)
        //Int + Int = Int (addition)

        int a=10, b=20;
        String str1 = "Hello";
        String str2 = "Java";

        System.out.println(a);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1+str2);
        System.out.println(str1+a+b);
        System.out.println(a+b+str1);
    }
}
