package n2s.ehc.pradeepsurya;

import java.util.Hashtable;
import java.util.Scanner;

public class UserOptions {

	private Hashtable<Integer, UserBean> hashTable = new Hashtable<>();
	// private Scanner scan = new Scanner(System.in);

	UserOptions() {

	}

	public void insert(Scanner scan) throws InvalidUserId {

		System.out.print("Enter UserId: ");
		int userId;

		try {
			userId = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException e) {
			throw new InvalidUserId("User Id is Invalid. Please enter a valid number.");
		}

		if (hashTable.containsKey(userId))
			throw new InvalidUserId("User Id already exist. Try different");

		System.out.print("Enter Name: ");
		String userName = scan.nextLine();
		hashTable.put(userId, new UserBean(userId, userName));
		System.out.println("\nYour Insert success!!!");

	}

	public void update(Scanner scan) throws UserIdNotFound, InvalidUserId {

		System.out.print("Enter UserId: ");
		int userId;

		try {
			userId = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException e) {
			throw new InvalidUserId("User Id is Invalid. Please enter a valid number.");
		}

		if (!hashTable.containsKey(userId))
			throw new UserIdNotFound("User Id not available. Try different");

		System.out.print("\nEnter Name: ");
		String userName = scan.nextLine();
		hashTable.put(userId, new UserBean(userId, userName));
		System.out.println("Update success!!!");

	}

	public void view() {

		System.out.println("S.No \t Id \t Name");
		System.out.println("--------------------------");
		int count = 1;
		for (UserBean user : hashTable.values()) {
			System.out.println(count++ + "\t " + user.getUserId() + "\t " + user.getUserName());
		}

	}

	public void delete(Scanner scan) throws UserIdNotFound, InvalidUserId {

		System.out.print("\nEnter UserId: ");
		int userId;

		try {
			userId = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException e) {
			throw new InvalidUserId("User Id is Invalid. Please enter a valid number.");
		}

		if (!hashTable.containsKey(userId))
			throw new UserIdNotFound("User Id not available. Try different");

		hashTable.remove(userId);
		System.out.println("Delete success!!!");

	}

	// public void closeScan() {
	// scan.close();
	// }

}
