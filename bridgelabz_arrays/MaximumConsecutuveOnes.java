package com.bridgelabz_arrays;
import java.util.*;
public class MaximumConsecutuveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		int maxcount=0;
		for(int i:arr) {
			if(i==1)
				count++;
			else
			{
				maxcount=maxcount>count?maxcount:count;
				count=0;
			}
		}
		maxcount=maxcount>count?maxcount:count;
		System.out.println(maxcount);

	}

}
