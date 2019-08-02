package capgemini.labbook;

import com.cg.eis.exception.EmployeeException;

public class Lab5_Ex6_EmployeeSalary {
	public static void main(String[] args) {
		String name = "Vijay";
		int empId = 100;
		float salary = 2000f;
		try {
			if (salary < 3000)
				throw new EmployeeException("Salary is below 3000");
			else
				System.out.println("Name : " + name + ", EmpId : " + empId + ", salary : " + salary);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}

}
