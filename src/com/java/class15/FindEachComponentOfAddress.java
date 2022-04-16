package com.java.class15;

// Write a program to print each component of Address into separate line
public class FindEachComponentOfAddress {
    public static void main(String[] args) {
        String address = "B604, Cosmos Society, Panama city, Flore, 200555";
        String[] words = address.split(" ");

        System.out.println(words[0].trim());
        System.out.println(words[1].trim());
        System.out.println(words[2].trim());
        System.out.println(words[3].trim());
        System.out.println(words[4].trim());

        }
    }

