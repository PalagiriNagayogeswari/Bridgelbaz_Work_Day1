package com.bridgelabz_arrays;

import java.util.Scanner;

public class PairWithGivenSum {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter array size: ");
        int n = sc.nextInt();


        int[] arr = new int[n];


        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }


        System.out.print("Enter target sum: ");
        int target = sc.nextInt();



        boolean found = false;


        for(int i = 0; i < n; i++) {


            for(int j = i + 1; j < n; j++) {


                if(arr[i] + arr[j] == target) {


                    System.out.println("Pair found:");

                    System.out.println(arr[i] + " " + arr[j]);

                    found = true;

                    break;

                }

            }


            if(found) {

                break;

            }

        }


        if(!found) {

            System.out.println("No pair found");

        }


        sc.close();

    }
}