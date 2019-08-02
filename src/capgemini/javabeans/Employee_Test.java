package capgemini.javabeans;

public class Employee_Test {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee( "VIJAY");
		Employee e3 = new Employee( "PAWAN");
		System.out.println(Employee.getCount());
		System.out.println(e1.getEmpId()+" "+e2.getEmpId()+" "+e3.getEmpId());
		System.out.println(e1.SEQUENCE);
		System.out.println(e2);


	}
}
