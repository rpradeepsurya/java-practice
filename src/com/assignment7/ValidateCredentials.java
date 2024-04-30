package com.assignment7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidateCredentials {

	public static void main(String[] args) {
		// 2. Custom Exception
		Map<Integer, String> credentials = new HashMap<>();
		credentials.put(12, "Raj");
		credentials.put(14, "Praveen");
		credentials.put(5, "Gopi");
		credentials.put(8, "Prakash");
		credentials.put(31, "Shabaz");

		Scanner scanner = new Scanner(System.in);

		// Get user ID and password input
		System.out.print("Enter User ID: ");
		int userId = Integer.parseInt(scanner.nextLine());
		System.out.print("Enter Password: ");
		String password = scanner.nextLine();

		try {
			if (credentials.containsKey(userId) && credentials.get(userId).equals(password))
				System.out.println("You have entered Correct userId and Password");
			else
				throw new InvalidCredentialsException("Sorry, User UserId, Password are wrong!");

		} catch (InvalidCredentialsException e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}
	}

}

class InvalidCredentialsException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidCredentialsException(String message) {
		super(message);
	}
}
