package com.bridgelabz_arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class UnionOfArrays {

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



        ArrayList<Integer> union = new ArrayList<>();


        // Add first array elements
        for(int i = 0; i < n1; i++) {


            if(!union.contains(arr1[i])) {

                union.add(arr1[i]);

            }

        }


        // Add second array elements
        for(int i = 0; i < n2; i++) {


            if(!union.contains(arr2[i])) {

                union.add(arr2[i]);

            }

        }



        System.out.println("Union of arrays:");

        System.out.println(union);



        sc.close();

    }
}