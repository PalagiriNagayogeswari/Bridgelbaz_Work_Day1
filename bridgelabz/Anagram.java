package com.bridgelabz;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		if(s1.length()==s2.length()){
		short[] arr=new short[26];
		for(char ch:s1.toCharArray()) {
			arr[ch-'a']++;
		}
		for(char ch:s2.toCharArray()) {
			arr[ch-'a']--;
		}
		boolean flag=true;
		for(int a:arr) {
			if(a!=0) {
				System.out.println("Not Anagrams");
				flag=false;
				break;
				
			}
		}
		if(flag==true)
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}

	}

}
