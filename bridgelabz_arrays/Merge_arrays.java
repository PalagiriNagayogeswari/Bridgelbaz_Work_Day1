package com.bridgelabz_arrays;
import java.util.*;
public class Merge_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int[] arr1=new int[n1];
		int[] arr2=new int[n2];
		int[] arr=new int[n1+n2];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		int index1=0,index2=0;
		int i=0;
		while(index1<arr1.length && index2<arr2.length) {
			if(arr1[index1]<=arr2[index2]) {
				arr[i]=arr1[index1];
				index1++;
				i++;
			}
			else{
				arr[i]=arr2[index2];
				index2++;
				i++;
			}
		}
		if(index1<arr1.length) {
			arr[i]=arr1[index1];
			index1++;
			i++;
		}
		else if(index2<arr2.length) {
			arr[i]=arr2[index2];
			index2++;
			i++;
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
