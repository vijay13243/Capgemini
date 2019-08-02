package capgemini.contactbook;

public interface ContactOperation {
	public void addContact(Contact contact);
	public void delContact(String firstname);
	public Contact findContact(String firstname);
	public void listAll();

}
