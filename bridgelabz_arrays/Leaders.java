package com.bridgelabz_arrays;
import java.util.*;
public class Leaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		} 
		ArrayList<Integer> list=new ArrayList<>();
		int maxele=arr[arr.length-1];
		list.add(maxele);
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>maxele) {
				list.add(arr[i]);
				maxele=arr[i];
			}
		}
		Collections.reverse(list);
		for(int ele:list) {
			System.out.println(ele);
		}

	}

}
