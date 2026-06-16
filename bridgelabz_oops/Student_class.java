package com.bridgelabz_oops;

public class Student_class {
	public class Student{
		int id;
		String name;
		int marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Student_class sc = new Student_class();

        Student_class.Student s1 = sc.new Student();
		s1.id=101;
		s1.name="Karthik";
		s1.marks=85;
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.marks);

	}

}
