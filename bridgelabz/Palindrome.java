package com.bridgelabz;
import java.util.*;
public class Palindrome {

    public static boolean PalindromeString(String s){
        String rev="";
        int i=0;
        for(i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        //System.out.println(rev);
        if(rev.equals(s))
            return true;
        else
            return false;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(PalindromeString(s));
    }
}
