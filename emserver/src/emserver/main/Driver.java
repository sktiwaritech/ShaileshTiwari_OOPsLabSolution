package emserver.main;

		import java.util.Scanner;
		import emserver.model.*;
		import emserver.service.*;
		public class Driver {
			private static Scanner sc = new Scanner(System.in);
			// Declare a main method
			public static void main(String args[]) {
				// Take inputs from the user for firstName, lastName, display the menu of all the departments - 1.Technical, 2.Admin, 3. Human Resource, 4. Legal, choice - department id, 
			System.out.println("Enter your first Name");
			String firstName = sc.next();
			System.out.println("Enter your last Name");
			String lastName = sc.next();
			
			System.out.println("Choose your department");
			System.out.println("1.Technical");
			System.out.println("2.Admin");
			System.out.println("3.Human Resource");
			System.out.println("4.Legal");
			
			int choice = sc.nextInt();
			Employee emp;
			// switch case and create an object of employee passing the firstName,lastName, "tech", "adm" ,"hr", "lg"
			switch(choice) {
				case 1:
					// create an object
					emp = new Employee(firstName,lastName,"tech");
					break;
				case 2:
					// create an object
					emp = new Employee(firstName,lastName,"adm");
					break;
				case 3:
					// create an object
					emp = new Employee(firstName,lastName,"hr");
					break;
				case 4:
					// create an object
					emp = new Employee(firstName,lastName,"lg");
					break;
				default:
					System.out.println("Wrong Choice");
					return;
				}
			// Call methods from CredentialService class
			CredentialService cs = new CredentialService();
			String email = cs.generateEmailAddress(emp);
			// System.out.println("Email Address "+email);
			String password = cs.generatePassword();
			// System.out.println("Password "+password);
			cs.showCredentials(emp, email, password);
			}
			
	
	}

