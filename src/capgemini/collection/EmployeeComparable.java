package capgemini.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class Employee implements Comparable<Employee>{
	private int empId;
	private String name;

	public Employee() {
		super();
	}

	public Employee( int empId, String name) {
		super();
		 this.empId=empId;
		 this.name=name;
	}

	public int getEmpId() {
		return empId;
	}


	@Override
	public String toString() {
		return " [empId=" + empId + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.empId==((Employee)o).empId)
		return 0;
		else if(this.empId>((Employee)o).empId)
		return 1;
		else return -1;
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
 
 class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getName().equals(e2.getName()))return 0;
		 else return -1;
	}
	
 }
 
 public class EmployeeComparable {
		public static void main(String args[]){
			Employee e1 = new Employee(101, "SRIRAM");
			Employee e2 = new Employee(103, "VIJAY");
			Employee e3 = new Employee( 102, "PAWAN");
			Employee[] emps={e1,e3,e2};
			//java.lang.classcastException:capgemini.collection.Employee
			// cannot be cast to java.lang.comparable
			Arrays.sort(emps,new NameComparator());
			System.out.println("Array sorted via Arrays.sort: " +Arrays.toString(emps));
			List<Employee> list=new ArrayList<Employee>();
			list.add(e1);
			list.add(e2);
			list.add(e3);
			System.out.println("Size: "+ list.size() + "\t" +list);
			Collections.sort(list);
			System.out.println("SORTED COLLECTIONS: " +(list));
			
			
		}
		}

