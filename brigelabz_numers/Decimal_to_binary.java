package com.brigelabz_numers;
import java.util.*;
public class Decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String res="";
		while(n>1) {
			//int temp=n/2;
			int i=n%2;
			res=res+i;
			n=n/2;
		}
		res=res+n;
		String res1="";
		for(int i=res.length()-1;i>=0;i--) {
			res1=res1+res.charAt(i);
		}
		System.out.println(res1);

	}

}
