package capgemini.contactbook;

import java.util.Scanner;

public class ContactOperationMain_2 {
	static Scanner sc=new Scanner(System.in);
	public static String getInput(String Message){
		System.out.println(Message);
		String input=sc.next();
		return input;
	}
	public static Contact getContact(){
		Contact contact=new Contact();
		contact.setFirstname(getInput("Enter first name:"));
		contact.setLastname(getInput("Enter last name:"));
		contact.setPhonenumber(getInput("Enter phone number:"));
		contact.setEmail(getInput("Enter email:"));
		return contact;
	}
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
				contactOperation.addContact(getContact());
				System.out.println("New Contact Added ");
				break;

			case 2:
			
				System.out.println("Enter the First Name");
				String firstname = sc.next();
				contactOperation.delContact(firstname);
				break;
			case 3:
				System.out.println("enter first name:");
				String firstName=sc.next();
				Contact f =contactOperation.findContact(firstName);
				if(f!=null)
					System.out.println(f);
				else
					System.out.println("Contact not Found");
				
			case 4:
				System.out.println("list all Contacts");
				contactOperation.listAll();
				break;
			default:

				System.out.println("Invalid choice");
				break;
			}
		} while (choice!=5);
		sc.close();
		System.out.println("Closing........");
	}
}
