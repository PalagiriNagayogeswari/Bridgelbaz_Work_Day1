package com.bridgelabz_arrays;

import java.util.Scanner;
import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter array size: ");
        int n = sc.nextInt();


        int[] arr = new int[n];


        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }


        System.out.print("Enter K value: ");
        int k = sc.nextInt();


        k = k % n;


        for(int i = 0; i < k; i++) {


            int first = arr[0];


            for(int j = 0; j < n - 1; j++) {

                arr[j] = arr[j + 1];

            }


            arr[n - 1] = first;

        }


        System.out.println("Array after left rotation:");

        System.out.println(Arrays.toString(arr));


        sc.close();

    }
}