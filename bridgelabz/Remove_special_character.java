package com.bridgelabz;
import java.util.*;
public class Remove_special_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String res="";
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
				res=res+s.charAt(i);
			}
		}
		System.out.println(res);

	}

}
