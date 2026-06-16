package com.bridgelabz_arrays;
import java.util.*;
public class Move_zeroes_to_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int curr=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				for(curr=i+1;curr<arr.length;curr++) {
					if(arr[curr]!=0) {
					int temp=arr[i];
					arr[i]=arr[curr];
					arr[curr]=temp;
					break;
					}
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
