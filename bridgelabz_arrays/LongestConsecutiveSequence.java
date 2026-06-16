package com.bridgelabz_arrays;

import java.util.Scanner;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter array size: ");
        int n = sc.nextInt();


        int[] arr = new int[n];


        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }


        HashSet<Integer> set = new HashSet<>();


        for(int num : arr) {

            set.add(num);

        }


        int longest = 0;


        for(int num : arr) {


            // check starting point
            if(!set.contains(num - 1)) {


                int current = num;

                int count = 1;


                while(set.contains(current + 1)) {


                    current++;

                    count++;

                }


                if(count > longest) {

                    longest = count;

                }

            }

        }



        System.out.println("Longest consecutive sequence length: " + longest);


        sc.close();

    }
}
