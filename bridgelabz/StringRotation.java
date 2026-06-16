package com.bridgelabz;

import java.util.*;

public class StringRotation {

    public static boolean checkRotation(String str1, String str2) {

        // Length should be same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Check str2 inside str1+str1
        String combined = str1 + str1;

        return combined.contains(str2);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(checkRotation(str1, str2));

    }
}