package com.assignment1;

public class Mobile {

	public String brand;
	public String color;
	public int camera;

	public static void main(String[] args) {
		// Task 4
		System.out.println("Default constructor test:\n");
		Mobile mobile = new Mobile();
		mobile.display();
		
		System.out.println("\n\nParameterized constructor test:\n");
		
		Mobile mbl = new Mobile("IPhone", "gold", 9);
		mbl.display();
		
		Mobile mble = new Mobile("Samsung", "black", 13);
		mble.display();

	}

	Mobile() {
		
		this.brand = "Nokia";
		this.color = "white";
		this.camera = 8;
	}

	Mobile(String brand, String color, int camera) {

		this.brand = brand;
		this.color = color;
		this.camera = camera;
	}
	
	public void display() {
		System.out.println(this.brand + " " + this.color + " color smartphone having " +
				this.camera + "MP camera.");
	}

}
