package com.assignment6;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int age;
	private int experience;
	private int salary;
	
	public Employee(int id, String name, int age, int experience, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee emp) {
		// sort employee based on name
		return this.name.compareTo(emp.getName());
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", experience=" + experience + ", salary="
				+ salary + "]";
	}
	
	

}
