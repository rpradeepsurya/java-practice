package com.assignment2;

public class Animal {
	
	protected String animalType;
	private String animalColor;
	
	Animal() {
		System.out.println("I'm an Animal");
	}

	public void eat() {
		System.out.println("I can eat");
	}

	public void sleep() {
		System.out.println("I can sleep");
	}

	public String getAnimalColor() {
		return animalColor;
	}

	public void setAnimalColor(String animalColor) {
		this.animalColor = animalColor;
	}

}
