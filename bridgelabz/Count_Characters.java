package com.bridgelabz;
import java.util.*;
public class Count_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=sc.next().charAt(0);
		HashMap<Character,Integer> map=new HashMap<>();
		for(char ch:s.toCharArray()) {
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		for(char ch:map.keySet()) {
			if(ch==c) {
				System.out.println(map.get(ch));
			}
		}

	}

}
