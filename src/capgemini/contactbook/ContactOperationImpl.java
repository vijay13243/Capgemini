package capgemini.contactbook;

import java.util.Arrays;

public class ContactOperationImpl implements ContactOperation {
	Contact[] contacts;

	public ContactOperationImpl(int size) {
		super();
		contacts = new Contact[size];
	}

	@Override
	public void addContact(Contact contact) {
		for (int index = 0; index < contacts.length; index++) {
			if (contacts[index] == null) {
				contacts[index] = contact;
				break;
			}
		}
	}

	@Override
	public void delContact(String firstname) {
		for (int index = 0; index < contacts.length; index++) {
			if (contacts[index] != null) {
				if (contacts[index].getFirstname().equals(firstname)) {
					contacts[index] = null;
					break;
				}
			}
		}
	}

	@Override
	public Contact findContact(String firstname) {
		Contact contact = null;
		for (int index = 0; index < contacts.length; index++) {
			if (contacts[index] != null && contacts[index].getFirstname().equals(firstname)) {
				contact=contacts[index];
				break;
			}
		}
		return contact;
	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(contacts));
	}
}
