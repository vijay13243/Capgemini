package capgemini.oops;

class Student {
	// fields...
	int rollNo;
	String name;
	float marks;
	final int OUT_OF_MARKS = 300;
	

	// constructors.....
	public Student() {
		rollNo = 10;
		name = "Vijay";
		marks = 87.3f;
		System.out.println("Student->Default constructor");
	}

	public Student(int Roll, String Name, float Marks) {
		rollNo = Roll;
		name = Name;
		marks = Marks;
		System.out.println("Student->parameter constructor");
	}

	// methods
	// calculate percentage
	public double calcPercentage() {
		return (marks / OUT_OF_MARKS) * 100;
	}

	// details display
	public void Display() {
		System.out.println("STUDENT DETAILS");
		System.out.println("ROLLNO: " + rollNo);
		System.out.println("NAME: " + name);
		System.out.println("MARKS: " + marks);
	}

	// calculate grade.....
	public String calcGrade() {
		double percentage = calcPercentage();
		if (percentage >= 85)
			return "A";
		else if (percentage >= 70 && percentage < 85)
			return "B";
		else
			return "C";

	}

	// Mark sheet
	public void MarkSheet() {
		Display();
		System.out.println("PERCENTAGE: " + calcPercentage());
		System.out.println("GRADE: " + calcGrade());
	}

	//// method overriding from parent object class.
	@Override // java annotation..
	public String toString() {
		return "RollNo:" + rollNo + " NAME:" + name + " MARKS: " + marks;
	}

	@Override
	public boolean equals(Object obj) {
		Student otherStudent = (Student) obj;
		if (rollNo == otherStudent.rollNo && name.equals(otherStudent.name) && marks == otherStudent.marks)
			return true;
		else
			return false;
	}

}

public class Student_Test {
	public static void main(String[] args) {
		// Declaration....
		Student s1, s2;
		s1 = new Student(60, "VIJAY PAWAN", 99.9f);
		s2 = new Student(60, "VIJAY PAWAN", 99.9f);
		s1.MarkSheet();
		System.out.println(s1);
		s2.MarkSheet();
		System.out.println(s2);
		if (s1.equals(s2))
			System.out.println("s1 equals to s2");
		else
			System.out.println("s1  not equals to s2");

	}

}
