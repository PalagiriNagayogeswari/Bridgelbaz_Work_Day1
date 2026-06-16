package com.bridgelabz_arrays;

import java.util.Scanner;

public class SecondSmallestElement {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter array size: ");
        int n = sc.nextInt();


        int[] arr = new int[n];


        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }



        int smallest = Integer.MAX_VALUE;

        int secondSmallest = Integer.MAX_VALUE;



        for(int i = 0; i < n; i++) {


            if(arr[i] < smallest) {


                secondSmallest = smallest;

                smallest = arr[i];


            }
            else if(arr[i] < secondSmallest && arr[i] != smallest) {


                secondSmallest = arr[i];

            }

        }



        System.out.println("Second smallest element: " + secondSmallest);


        sc.close();

    }
}