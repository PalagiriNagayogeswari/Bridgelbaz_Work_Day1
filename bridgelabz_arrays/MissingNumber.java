package com.bridgelabz_arrays;

public class MissingNumber {

    public static void main(String[] args) {


        int[] arr = {1,2,4,5};


        int n = 5;


        int totalSum = n * (n + 1) / 2;


        int arraySum = 0;


        for(int i = 0; i < arr.length; i++) {

            arraySum += arr[i];

        }


        int missing = totalSum - arraySum;


        System.out.println("Missing number: " + missing);

    }
}