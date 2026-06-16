package com.brigelabz_numers;
import java.util.*;
public class Perfect_numer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				sum=sum+i;
		}
		if(sum==n)
			System.out.println("yes");
		else
			System.out.println("No");

	}

}
