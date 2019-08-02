package capgemini.javabeans;

public class Rectangle_Test {
	public static void main(String[] args) {
		// declaration
		Rectangle r1;
		// object instantiation
		r1 = new Rectangle();
		// accessing field of an object
		r1.setLength(5.5f);
		r1.setBreadth(5.5f);
		// accessing method of an object
		System.out.println("Length:" + r1.getLength());
		System.out.println("Breadth:" + r1.getBreadth());
		System.out.println("Area: " + r1.calcArea());
		if (r1.equals(r1))
			System.out.println("EQUAL");
		else
			System.out.println("NOT EQUAL");
	}

}
