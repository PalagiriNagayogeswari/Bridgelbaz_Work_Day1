package com.bridgelabz;
import java.util.*;
public class remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(char ch:s.toCharArray()) {
			set.add(ch);
		}
		//System.out.println(set);
		for(char ch:set) {
			System.out.print(ch);
		}

	}

}
