package com.assignment2;

public class Dog extends Animal {
	
	// Default Constructor
	Dog() {
		System.out.println("I'm a Dog");
		super.eat();
	}
	
	public void bark() {
		System.out.println("I can bark"); 
	}
	
	public void displayInfo() {
		System.out.println("I'm a " + super.animalType);
		System.out.println("My color is " + super.getAnimalColor());
	}
	
	// Method Overriding
	@Override
	public void eat() {
		System.out.println("I'm eating food");
	}
	
	@Override
	public void sleep() {
		System.out.println("I;m sleeping now");
	}

}
