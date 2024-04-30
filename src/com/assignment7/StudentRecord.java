package com.assignment7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRecord {

	public static void main(String[] args) {
		// 3. Student Record Verification

		Scanner scanner = new Scanner(System.in);
		// HashMap with student IDs and names
		Map<Integer, String> studentList = new HashMap<>();
		studentList.put(101, "Karthi");
		studentList.put(102, "Jothi");
		studentList.put(103, "Vithi");
		studentList.put(104, "Sunil");

		try {
			System.out.print("Enter User ID: ");
			int userId = Integer.parseInt(scanner.nextLine());
			System.out.print("Enter Name: ");
			String name = scanner.nextLine();

			// Validate credentials
			if (studentList.containsKey(userId) && studentList.get(userId).equals(name)) {
				System.out.println("Access provided");

				System.out.print("Enter marks for M1: ");
				int m1 = Integer.parseInt(scanner.nextLine());
				System.out.print("Enter marks for M2: ");
				int m2 = Integer.parseInt(scanner.nextLine());

				int total = m1 + m2;
				System.out.println("Total Marks: " + total);

				if (m1 == 0 || m2 == 0) {
					throw new ArithmeticException("Divide by Zero Not possible!");
				}
				int division = m1 / m2;
				System.out.println("Division of M1 and M2: " + division);
			} else {
				throw new AccessDeniedException("You don’t have access to use the application");
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid number format: " + e.getMessage());
		} catch (AccessDeniedException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}
	}
}

class AccessDeniedException extends Exception {

	private static final long serialVersionUID = 1L;

	public AccessDeniedException(String message) {
		super(message);
	}
}
