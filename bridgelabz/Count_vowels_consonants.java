package com.bridgelabz;
import java.util.*;
public class Count_vowels_consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count1=0;
		int count2=0;
		String s=sc.nextLine().toLowerCase();
		for(char ch:s.toCharArray()) {
			if(ch>='a' && ch<='z') {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count1++;
			}
			else {
				count2++;
			}
			}
		}
		System.out.println("Vowels = "+count1);
		System.out.println("Consonants = " +count2);

	}

}
