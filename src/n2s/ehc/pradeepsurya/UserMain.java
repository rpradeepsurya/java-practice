package n2s.ehc.pradeepsurya;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		UserOptions userOption = new UserOptions();
		boolean doContinue = true; 

		while (doContinue) {
			// get user options
			System.out.println("Choose the option below");
			System.out.print("************************\n");
			System.out.println(" 1 - Insert \n 2 - Update \n 3 - Delete \n 4 - View \n 5 - Exit");

			System.out.print("Enter your option value: ");
			System.out.println();

			try {
				int num = Integer.parseInt(scan.nextLine());					

				switch (num) {
				case 1: // Insert
					boolean insertMore = true;
					while (insertMore) {	
						try {
							userOption.insert();
						} catch (InvalidUserId e) {
							e.printStackTrace();
						}
						insertMore = isContinue(scan, "insert");
					}
					
					break;
				case 2: // Update
					boolean updateMore = true;
					while (updateMore) {	
						try {
							userOption.update();
						} catch (UserIdNotFound e) {
							e.printStackTrace();
						}
						updateMore = isContinue(scan, "update");
					}

					break;
				case 3: // Delete
					boolean deleteMore = true;
					while (deleteMore) {	
						try {
							userOption.delete();
						} catch (UserIdNotFound e) {
							e.printStackTrace();
						}
						deleteMore = isContinue(scan, "delete");
					}

					break;
				case 4: // View
					userOption.view();
					break;
				case 5: // Exit
					System.out.println("Exit");
					System.out.println("******");
					System.out.println("Ending the flow. Thank you!!!");
					doContinue = false;	
					scan.close();
					userOption.closeScan();
					break;
				default:
					throw new InvalidEntry("Invalid option selected");
				}
				
			} catch (InvalidEntry e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}

	}
	
	private static boolean isContinue(Scanner scan, String option) {
		
		System.out.print("Wish to " + option + " more (y/n): ");
		String val = scan.next();
		return val.equals("y");
	}

}
