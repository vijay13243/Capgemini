package capgemini.contactbook;

import java.util.Scanner;

public class ContactOperationImpl_Main {
	public static void main(String[] args) {

		ContactOperation contactOperation = new ContactOperationImpl(3);
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Welcome to Contact Book");
			System.out.println("1. ADD contact:");
			System.out.println("2. Delete Contact:");
			System.out.println("3. ListALL:");
			System.out.println("4. Save All");
			System.out.println("5. Restore All");
			System.out.println("6. EXIT");
			System.out.println("ENTER Choice");
			choice = sc.nextInt();
			switch (choice)

			{
			case 1:

				Contact contact = new Contact("Vijay", "Pawan", "gokavarapuvijay@gmail.com", "9642272578");
				contactOperation.addContact(contact);
				System.out.println("\t \t::==>Contact is created..... ");
				break;

			case 2:
			
				System.out.println("Enter the First Name");
				String firstname = sc.next();
				contactOperation.delContact(firstname);
				System.out.println("Deleted firstname");
				break;
			case 3:
				System.out.println("enter first name:");
				String firstName=sc.next();
				contact=contactOperation.findContact(firstName);
				
			case 4:
				System.out.println("list all Contacts");
				contactOperation.listAll();
				break;
			default:

				System.out.println("Invalid choice");
				break;
			}
		} while (choice != 5);
		sc.close();
		System.out.println("Closing........");
	}
}
