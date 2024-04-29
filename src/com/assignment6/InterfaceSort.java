package com.assignment6;

import java.util.Scanner;
import java.util.TreeSet;

public class InterfaceSort {

	public static void main(String[] args) {
		// 1. Sort treeset in ascending order using comparable interface
		
		Scanner scan = new Scanner(System.in);
		TreeSet<Employee> set = new TreeSet<>();
		
		System.out.print("Enter Totoal number of employees: ");
		int n = scan.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Enter the value for employee " + i + " :\n");
			
			System.out.print("EMP id: ");
			int id = scan.nextInt();
			
			System.out.print("EMP name: ");
			String name = scan.next();
			
			System.out.print("EMP age: ");
			int age = scan.nextInt();
			
			System.out.print("EMP experience: ");
			int experience = scan.nextInt();
			
			System.out.print("EMP salary: ");
			int salary = scan.nextInt();
			
			set.add(new Employee(id, name, age, experience, salary));
		}
		
		System.out.println(set);
		scan.close();

	}

}
