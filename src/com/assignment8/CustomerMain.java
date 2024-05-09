package com.assignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		
		List<Customer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		// Input loop for 5 customers
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for customer " + (i + 1));
            
            System.out.print("Customer ID: ");
            int id = Integer.parseInt(scan.nextLine());
            
            System.out.print("Customer Name: ");
            String name = scan.nextLine();
            
            System.out.print("Contact No: ");
            long contact = Long.parseLong((scan.nextLine()));
            
            System.out.print("City: ");
            String city = scan.nextLine();
            list.add(new Customer(id, name, contact, city));
        }
        
        Collections.sort(list);

        System.out.println("Sorted Customer List:");
        list.forEach(System.out::println);

        System.out.print("Enter a customer ID to get details: ");
        int searchId = Integer.parseInt(scan.nextLine());

        try {
        	boolean found = false;
        	for (Customer customer : list) {
                if (customer.getId() == searchId) {
                	System.out.println("Customer Found: " + customer);
                	found = true;
                	break;
                }
            }
            if (!found)         
            	throw new UserNotFoundException("Sorry, You are not a valid user \n User id doesn’t exist");
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            scan.close();
        }
	}

}
