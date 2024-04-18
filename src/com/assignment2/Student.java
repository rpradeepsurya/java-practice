package com.assignment2;

public class Student {

	public int rollNo;
	public String name;
	public int age;
	public static String collegeName = "ABC Institution";

	public static void main(String[] args) {
		// static varaible and static method
		Student student1 = new Student(1, "John", 22, "XYZ Institution");
		Student student2 = new Student(2, "Doe", 23, "QWERTY Institution");
		Student student3 = new Student(3, "Felix", 24, "JKL College");

		Student.setCollegeName("SDF College");
		student1.display();
		student2.display();
		student3.display();

	}

	public static void setCollegeName(String name) {
		collegeName = name;
	}

	Student(int rollNo, String name, int age, String collegeName) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.collegeName = collegeName;
	}

	public void display() {
		System.out.println("Student Roll no: " + rollNo);
		System.out.println("Student name: " + name);
		System.out.println("Student age: " + age);
		System.out.println("College name: " + collegeName + "\n");
	}

}
