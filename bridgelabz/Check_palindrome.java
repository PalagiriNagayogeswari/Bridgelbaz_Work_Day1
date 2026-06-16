package com.bridgelabz;

import java.util.Scanner;

public class Check_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res=res+s.charAt(i);
		}
		if(res.equals(s)) {
			System.out.println("Yes it is palindrome");
		}
		else {
			System.out.println("No it is not a palindrome");
		}

	}

}
