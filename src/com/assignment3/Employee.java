package com.assignment3;

import java.util.Scanner;

public class Employee {

	public String name;
	public String email;
	public String designation;
	public static final int count = 5;

	public static void main(String[] args) {
		// task - use final keyword

		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= count; i++) {

			System.out.println("Enter the values for Employee " + i);
			System.out.print("Employee name: ");
			scan.nextLine();
			System.out.print("Employee email: ");
			scan.nextLine();
			System.out.print("Employee designation: ");
			scan.nextLine();
			System.out.println();
		}
		scan.close();	
		System.out.println("\nStop adding details!");
		System.out.println("Maximum employee lists are reached");
	}

}
