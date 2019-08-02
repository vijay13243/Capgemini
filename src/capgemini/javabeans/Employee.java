package capgemini.javabeans;

public class Employee {
	private int empId;
	private String name;
	public static int COUNT;
	public static int SEQUENCE;

	static {
		SEQUENCE = 100;
		COUNT = 200;
		System.out.println("I AM IN STATIC BLOCK");
	}

	public Employee() {
		super();
		empId = ++SEQUENCE;
		COUNT++;
	}

	public Employee(String name) {
		super();
		// this.empId=empId;
		// this.name=name;
		setEmpId(SEQUENCE);
		setName(name);
		COUNT++;
		empId = ++SEQUENCE;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getCount() {
		return COUNT;
	}

	// @Override
	public String toString_Buffer() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Employee Details:EMPID:");
		buffer.append(empId);
		buffer.append("NAME:");
		buffer.append(name);
		return buffer.toString();
	}

	// @Override
	public String toString_StringBuilder() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee Details:EMPID:");
		builder.append(empId);
		builder.append("NAME:");
		builder.append(name);
		return builder.toString();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=").append(empId).append(", name=").append(name).append("]");
		return builder.toString();
	}

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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
