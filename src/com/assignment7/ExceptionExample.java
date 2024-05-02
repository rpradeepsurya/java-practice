package com.assignment7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionExample {
	
    static class DuplicateNameException extends Exception {
		private static final long serialVersionUID = 1L;

		public DuplicateNameException(String name) {
            super("Alert: Student name " + name + " is not possible to add in List");
        }
    }

    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter 10 Student names without Duplication");

        while (studentNames.size() < 10) {
            System.out.print((studentNames.size() + 1) + ". ");
            String name = scanner.nextLine();

            try {
                if (studentNames.contains(name)) {
                    throw new DuplicateNameException(name);
                }
                studentNames.add(name);
            } catch (DuplicateNameException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        scanner.close();
    }

}
