package capgemini.contactbook;

import java.io.Serializable;

public class Contact implements Serializable{
	private String firstname;
	private String lastname;
	private String email;
	private String phonenumber;
	public Contact(){
		super();
	}
	public Contact(String firstname, String lastname, String email, String phonenumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Contact [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", phonenumber="
				+ phonenumber + "]";
	}
	

}
