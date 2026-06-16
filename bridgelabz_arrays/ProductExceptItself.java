package com.bridgelabz_arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ProductExceptItself {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter array size: ");
        int n = sc.nextInt();


        int[] arr = new int[n];


        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }


        int[] result = new int[n];


        // Left product
        result[0] = 1;

        for(int i = 1; i < n; i++) {

            result[i] = result[i - 1] * arr[i - 1];

        }


        // Right product
        int rightProduct = 1;


        for(int i = n - 1; i >= 0; i--) {


            result[i] = result[i] * rightProduct;


            rightProduct = rightProduct * arr[i];

        }



        System.out.println("Product array:");

        System.out.println(Arrays.toString(result));


        sc.close();

    }
}