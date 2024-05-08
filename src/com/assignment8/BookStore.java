package com.assignment8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BookStore {

	public static void main(String[] args) {

		Set<Book> set = new HashSet<>();
		Scanner scan = new Scanner(System.in);

		System.out.println("____________________________\n");
		System.out.println("Enter the data for Book Store");
		System.out.println("_____________________________\n");

		try {
			System.out.print("1. Provide Book id: ");
			int id = Integer.parseInt(scan.nextLine());

			System.out.print("2. Enter Book name: ");
			String name = scan.nextLine();

			System.out.print("3. Enter Book Price: ");
			float price = Float.parseFloat(scan.nextLine());

			if (!set.add(new Book(id, name, price))) {
				throw new DuplicateEntryException("Sorry, you’re trying to enter repeated Book details");
			} else {
				System.out.println("\nThank you, details added");
			}

		} catch (DuplicateEntryException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			scan.close();
		}

	}

}
