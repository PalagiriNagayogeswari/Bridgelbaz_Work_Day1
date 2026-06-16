package com.bridgelabz_arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Merge_arrays {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first array size: ");
        int n1 = sc.nextInt();


        int[] arr1 = new int[n1];


        System.out.println("Enter first array elements:");

        for(int i = 0; i < n1; i++) {

            arr1[i] = sc.nextInt();

        }



        System.out.print("Enter second array size: ");
        int n2 = sc.nextInt();


        int[] arr2 = new int[n2];


        System.out.println("Enter second array elements:");

        for(int i = 0; i < n2; i++) {

            arr2[i] = sc.nextInt();

        }



        int[] merged = new int[n1 + n2];


        for(int i = 0; i < n1; i++) {

            merged[i] = arr1[i];

        }


        for(int i = 0; i < n2; i++) {

            merged[n1 + i] = arr2[i];

        }


        System.out.println("Merged Array:");

        System.out.println(Arrays.toString(merged));


        sc.close();

    }
}