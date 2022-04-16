package com.project;
import java.util.Scanner;
/**
 * Take an input from the user and print middle char(s)
 *  1) when odd number of chars and more than 2 chars, print a middle character. ex: cat -> a
 *  2) when even number of chars and more than 3 chars, print 2 middle characters. ex: java -> av
 *  3) if a single character, print character 3 times. ex: & -> &&&
 *  4) if a double character, print characters 2 times. ex: @@ -> @@@@
 */
public class PrintMiddleChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        String result = "";

        if (length % 2 != 0 && length > 2) {
            result = String.valueOf(str.charAt(length / 2));
            System.out.println(result);
        } else if (length % 2 == 0 && length > 3) {
            result = str.substring(length / 2 - 1, length / 2 + 1);
            System.out.println(result);
        } else if (length == 1) {
            result = str + str + str;
            System.out.println(result);
        } else if (length == 2 && str.charAt(0)== str.charAt(1)) {
            result = str + str;
            System.out.println(result);

        }
    }
}
