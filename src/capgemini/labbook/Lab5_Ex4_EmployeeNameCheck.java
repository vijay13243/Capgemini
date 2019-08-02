package capgemini.labbook;

class Employee {
	private int empId;
	private String firstName;
	private String lastName;

	public Employee() {
		super();
	}

	public Employee(int empId, String firstName, String lastName) throws EmployeeNameException {
		super();
		this.setEmpId(empId);
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws EmployeeNameException {
		if (firstName == null || firstName == "")
			throw new EmployeeNameException("First Name is Empty");
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) throws EmployeeNameException {
		if (lastName == null || lastName == "")
			throw new EmployeeNameException("Last name is empty");
		this.lastName = lastName;
	}

	/*@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=");
		builder.append(empId);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append("]");
		return builder.toString();
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}

 class EmployeeNameException extends Exception {
	public EmployeeNameException(String message) {
		super(message);
	}
}

public class Lab5_Ex4_EmployeeNameCheck {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		try {
			e1.setEmpId(101);
			e1.setFirstName("");
			e1.setLastName("pawan");
		} catch (EmployeeNameException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}