package com.bridgelabz_oops;

public class Parameter_constructor {
	public class para_cons{
		int id;
		String name;
		para_cons(int id,String name){
			this.id=id;
			this.name=name;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameter_constructor pc=new Parameter_constructor();
		para_cons ps=pc.new para_cons(101,"Karthik");
		System.out.println(ps.id);
		System.out.println(ps.name);

	}

}
