package n2s.ehc.pradeepsurya;

import java.util.Scanner;

public class UserMain {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		UserOptions userOption = new UserOptions();
		boolean doContinue = true;

		while (doContinue) {
			// get user options
			System.out.println("\nChoose the option below");
			System.out.print("************************\n");
			System.out.println(" 1 - Insert \n 2 - Update \n 3 - Delete \n 4 - View \n 5 - Exit");

			System.out.print("\nEnter your option value: ");
			System.out.println();

			try {
				int num = Integer.parseInt(scan.nextLine());

				switch (num) {
				case 1: // Insert
					boolean insertMore = true;
					while (insertMore) {
						try {
							userOption.insert(scan);
						} catch (InvalidUserId e) {
							System.out.println(e.getMessage());
						}
						insertMore = isContinue(scan, "insert");
					}
					break;
				case 2: // Update
					boolean updateMore = true;
					while (updateMore) {
						try {
							userOption.update(scan);
						} catch (UserIdNotFound e) {
							System.out.println(e.getMessage());
						}
						updateMore = isContinue(scan, "update");
					}
					break;
				case 3: // Delete
					boolean deleteMore = true;
					while (deleteMore) {
						try {
							userOption.delete(scan);
						} catch (UserIdNotFound e) {
							System.out.println(e.getMessage());
						}
						deleteMore = isContinue(scan, "delete");
					}
					break;
				case 4: // View
					userOption.view();
					break;
				case 5: // Exit
					System.out.println("\nExit");
					System.out.println("******");
					System.out.println("Ending the flow. Thank you!!!");
					doContinue = false;
					scan.close();
//					userOption.closeScan();
					break;
				default:
					throw new InvalidEntry("Invalid option selected");
				}

			} catch (InvalidEntry e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Enter a valid option from 1 to 5.\n");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	private static boolean isContinue(Scanner scan, String option) {

		System.out.print("\nWish to " + option + " more (y/n): ");
		String val = scan.nextLine();
		return val.equals("y");
	}

}
