package com.bridgelabz;
import java.util.*;
public class Only_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean flag=true;
		for(int i=0;i<s.length();i++) {
			if(!(s.charAt(i)>'0' && s.charAt(i)<'9')) {
				System.out.println("False");
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("True");

	}

}
