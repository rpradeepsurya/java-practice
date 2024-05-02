package com.assignment8;

public class Employee {

	private int id;
	private String name;
	private int experience;

	public Employee(int id, String name, int experience) {
		this.id = id;
		this.name = name;
		this.experience = experience;
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

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

}
