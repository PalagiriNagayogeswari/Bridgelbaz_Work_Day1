package com.bridgelabz;
import java.util.*;
public class Reverse_each_word {
	 
	public static String reversestring(String s) {
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res=res+s.charAt(i);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(reversestring(arr[i]));	
		}
		
	}

}
