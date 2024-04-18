package com.assignment2;

public class Test {

	public static void main(String[] args) {
		// Inheritance
		
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		
		Dog dog = new Dog();
		dog.bark();
		dog.eat();
		dog.sleep();
		
		dog.animalType = "mammal";
		dog.setAnimalColor("black");
		dog.displayInfo();

	}

}
