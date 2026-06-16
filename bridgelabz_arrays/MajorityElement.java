package com.bridgelabz_arrays;
import java.util.*;
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		int maxele=0;
		int max=0;
		for(int i:map.keySet()) {
			if(map.get(i)>max) {
				max=map.get(i);
				maxele=i;
			}
		}
		System.out.println(maxele);

	}

}
