package com.assignment2;

public class Employee {

	public String name;
	public int id;
	public int salary = 0;

	public static void main(String[] args) {
		// Overloading - polymorphism
		Employee emp1 = new Employee();
		emp1.setDetails("John", 11);
		emp1.getDetails();

		Employee emp2 = new Employee();
		emp2.setDetails("Doe", 14, 2000);
		emp2.getDetails();

	}

	public void setDetails(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void setDetails(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void getDetails() {
		System.out.println(id + ". " + name + " " + salary);
	}

}
