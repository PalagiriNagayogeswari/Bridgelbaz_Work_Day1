package com.bridgelabz_arrays;

import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter array size: ");
        int n = sc.nextInt();


        int[] arr = new int[n];


        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }


        int[] temp = new int[n];

        int index = 0;


        for(int i = 0; i < n; i++) {

            boolean duplicate = false;


            for(int j = 0; j < index; j++) {


                if(arr[i] == temp[j]) {

                    duplicate = true;
                    break;

                }
            }


            if(!duplicate) {

                temp[index] = arr[i];
                index++;

            }

        }


        System.out.println("Array after removing duplicates:");


        for(int i = 0; i < index; i++) {

            System.out.print(temp[i] + " ");

        }


        sc.close();

    }
}