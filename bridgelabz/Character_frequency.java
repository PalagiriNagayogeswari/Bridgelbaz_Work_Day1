package com.bridgelabz;
import java.util.*;
public class Character_frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		for(char ch:s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(char ch:map.keySet()) {
			System.out.println(ch +" = "+map.get(ch));
		}

	}

}
