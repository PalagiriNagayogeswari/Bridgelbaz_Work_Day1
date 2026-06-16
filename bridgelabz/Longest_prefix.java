package com.bridgelabz;
import java.util.*;
public class Longest_prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		String prefix=arr[0];
		for(int i=1;i<arr.length;i++) {
			while(arr[i].indexOf(prefix)!=0) {
				prefix=prefix.substring(0,prefix.length()-1);
			}
		}
		System.out.println(prefix);
		

	}

}
