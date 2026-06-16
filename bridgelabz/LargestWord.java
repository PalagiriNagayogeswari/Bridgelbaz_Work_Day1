package com.bridgelabz;

import java.util.*;

public class LargestWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String words[] = sentence.split(" ");

        String largest = "";

        for(String word : words) {

            if(word.length() > largest.length()) {

                largest = word;

            }

        }

        System.out.println(largest);

    }
}