package capgemini.javabeans;

public class Circle extends Shape {
	// fields
	private float radius;

	// default constructor
	public Circle() {
		this(0.0f);
		System.out.println("Circle->default.....");
	}

	// parameter constructor
	public Circle(float radius) {
		// this.radius=radius;
		setRadius(radius);
		System.out.println("Circle->parameter.....");
	}

	// setter
	public void setRadius(float radius) {
		this.radius = radius;
	}

	// getter
	public float getRadius() {
		return radius;
	}

	public void draw() {
		System.out.println("CIRCLE IS DRAWN");
	}

	// calcaulate area
	public double calcArea() {
		return getRadius() * getRadius() * Math.PI;
	}

	// to string
	@Override
	public String toString() {
		return "Circle radius=" + getRadius();
	}

	// compare method
	public static Circle whoisBiggerOne(Circle cirOne, Circle cirTwo) {
		if (cirOne.getRadius() > cirTwo.getRadius())
			return cirOne;
		else
			return cirTwo;
	}

	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Float.floatToIntBits(radius) != Float.floatToIntBits(other.radius))
			return false;
		return true;
	}

}
