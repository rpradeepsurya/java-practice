package com.basics;

import java.util.Scanner;

public class GetUserData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the name");
		String name = scan.next();

		System.out.println("Enter the age");
		int age = scan.nextInt();

		System.out.println("Name = " + name + ", Age = " + age);

		scan.close();
	}

}
