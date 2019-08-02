package capgemini.javabeans;

public class Rectangle extends Shape {
	// field
	private float length, breadth;

	// default
	public Rectangle() {
		// to call another constructor
		this(0.0f, 0.0f); // will call parameter constructor...
		System.out.println("Rectangle->default....");
	}

	// parameter
	public Rectangle(float length, float breadth) {
		// this.length=length;
		// this.breadth=breadth;
		setLength(length);
		setBreadth(breadth);
		System.out.println("Rectangle->parameter....");
	}

	// setter method...
	public void setLength(float length) {
		if (length > 0)
			this.length = length;
	}

	public void setBreadth(float breadth) {
		if (breadth > 0)
			this.breadth = breadth;
	}

	// getter method...
	public float getLength() {
		return length;
	}

	public float getBreadth() {
		return breadth;
	}

	// to calculate area
	public double calcArea() {
		return getLength() * getBreadth();
	}

	// to string
	@Override
	public String toString() {
		return "length=" + getLength() + ", breadth=" + getBreadth();
	}
	// compare method
	public static Rectangle whoisBiggerOne(Rectangle rectOne, Rectangle rectTwo){
		if(rectOne.getLength()>rectTwo.getLength())
		return rectOne;
		else
			return rectTwo;
	}

	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // r1.equals(r1)
			return true;
		if (obj == null) // r1.equals(null)
			return false;
		if (getClass() != obj.getClass()) // r1.equals("abc");
			return false;
		Rectangle other = (Rectangle) obj;
		if (Float.floatToIntBits(breadth) != Float.floatToIntBits(other.breadth))
			return false;
		if (Float.floatToIntBits(length) != Float.floatToIntBits(other.length))
			return false;
		return true;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("RECTANGLE IS DRAWN");

	}
}
