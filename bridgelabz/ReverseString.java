package com.bridgelabz;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String rev="";
        int i=0;
        for(i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);

    }



}
