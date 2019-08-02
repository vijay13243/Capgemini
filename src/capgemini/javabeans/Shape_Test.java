package capgemini.javabeans;

public class Shape_Test {
	public static void main(String[] args) {
		// declaration
		Circle c1, c2;
		// object instantiation
		c1 = new Circle();
		c2 = new Circle(9.9f);
		// accessing field of an object
		c1.setRadius(5.5f);
		// accessing method of an object
		System.out.println("Radius:" + c1.getRadius());
		System.out.println("Area: " + c1.calcArea());
		System.out.println("Bigger One:" + Circle.whoisBiggerOne(c1, c2));
		if (c1.equals(c1))
			System.out.println("EQUAL");
		else
			System.out.println("NOT EQUAL");
		System.out.print("\n");
		// declaration
		Rectangle r1, r2;
		// object instantiation
		r1 = new Rectangle();
		r2 = new Rectangle(9.5f, 8.5f);
		// accessing field of an object
		r1.setLength(5.5f);
		r1.setBreadth(5.5f);
		// accessing method of an object
		System.out.println("Length:" + r1.getLength());
		System.out.println("Breadth:" + r1.getBreadth());
		System.out.println("Area: " + r1.calcArea());
		System.out.println("Bigger One:" + Rectangle.whoisBiggerOne(r1, r2));
		if (r1.equals(r1))
			System.out.println("EQUAL");
		else
			System.out.println("NOT EQUAL");
		System.out.print("\n");

		// triangle
		// declaration
		Triangle t1, t2;
		// object instantiation
		t1 = new Triangle();
		t2 = new Triangle(9.5f, 6.2f);
		// accessing field of an object
		t1.setBase(59.5f);
		t1.setHeight(5.5f);
		// accessing method of an object
		System.out.println("Base:" + t1.getBase());
		System.out.println("Height:" + t1.getHeight());
		System.out.println("Area: " + t1.calcArea());
		System.out.println("Bigger One:" + Triangle.whoisBiggerOne(t1, t2));
		if (t1.equals(t1))
			System.out.println("EQUAL");
		else
			System.out.println("NOT EQUAL");

	}

}
