package com.bridgelabz;
import java.util.*;
public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String res=" ";
		for(int i=s.length()-1;i>=0;i--) {
			res=res+s.charAt(i);
		}
		System.out.print(s);
		System.out.println(res);

	}

}
