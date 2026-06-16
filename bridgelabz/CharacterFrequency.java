package com.bridgelabz;

import java.util.*;

public class CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();


        HashMap<Character, Integer> map = new HashMap<>();


        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }


        for(Map.Entry<Character, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + "=" + entry.getValue());

        }

    }
}