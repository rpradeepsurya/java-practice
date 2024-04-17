package com.assignment1;

import java.util.Scanner;

public class MarkSheet extends Student implements Manipulate {

	public static void main(String[] args) {
		// Set 2 - Task 1
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Marks for the Subjects:");
		System.out.print("Subject 1: ");
		int subject1 = scan.nextInt();

		System.out.print("Subject 2: ");
		int subject2 = scan.nextInt();

		System.out.print("Subject 3: ");
		int subject3 = scan.nextInt();

		System.out.print("Subject 4: ");
		int subject4 = scan.nextInt();

		scan.close();

		MarkSheet mark = new MarkSheet(1001, "Guna");
		mark.displayMarkList(subject1, subject2, subject3, subject4);

	}

	MarkSheet(int id, String name) {
		super(id, name);
	}

	@Override
	public int getTotal(int... num) {
		int sum = 0;

		for (int val : num)
			sum += val;

		return sum;
	}

	@Override
	public void displayMarkList(int... num) {

		System.out.println("\nStudent Mark list:");

		System.out.println("Student ID: " + super.Student_id);
		System.out.println("Student Name: " + super.Student_name);

		int count = 1;

		for (int val : num) {
			System.out.println("Subject " + count + " : " + val);
			count++;
		}

		System.out.println("Total marks: " + getTotal(num));

	}

}
