package com.bridgelabz_arrays;

import java.util.Scanner;

public class CheckSortedArray {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter array size: ");
        int n = sc.nextInt();


        int[] arr = new int[n];


        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }



        boolean sorted = true;



        for(int i = 0; i < n - 1; i++) {


            if(arr[i] > arr[i + 1]) {


                sorted = false;

                break;

            }

        }



        System.out.println("Array is sorted: " + sorted);


        sc.close();

    }
}