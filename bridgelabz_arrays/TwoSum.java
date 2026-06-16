package com.bridgelabz_arrays;
import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int remain=target-arr[i];
			if(map.containsKey(remain)) {
				System.out.println(map.get(remain));
				System.out.println(i);
				break;
			}
			else {
				map.put(arr[i], i);
			}
		}

	}

}
