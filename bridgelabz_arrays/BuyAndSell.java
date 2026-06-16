package com.bridgelabz_arrays;
import java.util.*;
public class BuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//brute force
		/*int maxprofit=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					maxprofit=maxprofit>arr[j]-arr[i]?maxprofit:arr[j]-arr[i];
				}
			}
		}
		System.out.println(maxprofit);*/
		
		int min=Integer.MAX_VALUE;
		int profit,maxprofit=0;
		for(int i:arr) {
			if(i<min)
				min=i;
			profit=i-min;
			if(profit>maxprofit)
				maxprofit=profit;
		}
		System.out.println(maxprofit);

	}

}
