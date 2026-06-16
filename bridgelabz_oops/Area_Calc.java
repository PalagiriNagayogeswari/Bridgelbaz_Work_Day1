package com.bridgelabz_oops;
import java.util.*;
public class Area_Calc {
	public void Area(int r) {
		System.out.println("Circle Area = "+3.14*r*r);
	}
	public void Area(int l,int b) {
		System.out.println("rectangle area = "+l*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int circ_rad=sc.nextInt();
		int rec_len=sc.nextInt();
		int rec_breadth=sc.nextInt();
		Area_Calc ar=new Area_Calc();
		ar.Area(circ_rad);
		ar.Area(rec_len,rec_breadth);

	}

}
