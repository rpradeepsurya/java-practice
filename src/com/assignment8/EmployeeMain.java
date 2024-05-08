package com.assignment8;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class EmployeeMain {

	public static void main(String[] args) {
		// 1. custom exception for employee experience > 10
		Scanner scan = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.println("*************************************");
		System.out.println("Provide the employee details to store");
		System.out.println("*************************************");

		try {
			System.out.print("1. Enter Employee ID: ");
			int id = Integer.parseInt(scan.nextLine());

			System.out.println("\n2. Enter Employee Name: ");
			String name = scan.nextLine();

			System.out.print("\n3.Enter Experience: ");
			int experience = Integer.parseInt(scan.nextLine());

			if (experience > 10) {
				list.add(new Employee(id, name, experience));
				System.out.println("Success: Your data is stored. Thank you!");
			} else
				throw new InvalidEntry("You are not a valid user.");
		} catch (InvalidEntry e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			scan.close();
		}
	}

}
