package capgemini.javabeans;

public class Triangle extends Shape {
	// field
	private float base, height;

	// default
	public Triangle() {
		// to call another constructor
		this(0.0f, 0.0f); // will call parameter constructor...
		System.out.println("Triangle->default....");
	}

	// parameter
	public Triangle(float base, float height) {
		// this.length=length;
		// this.breadth=breadth;
		setBase(base);
		setHeight(height);
		System.out.println("Triangle->parameter....");
	}

	// setter method...
	public void setBase(float base) {
		if (base > 0)
			this.base = base;
	}

	public void setHeight(float height) {
		if (height > 0)
			this.height = height;
	}

	// getter method...
	public float getBase() {
		return base;
	}

	public float getHeight() {
		return height;
	}

	// to calculate area
	public double calcArea() {
		return getHeight() * getBase() * 0.5;
	}

	// to string
	@Override
	public String toString() {
		return "Base=" + getBase() + ", Height=" + getHeight();
	}

	// compare method
	public static Triangle whoisBiggerOne(Triangle triaOne, Triangle triaTwo) {
		if (triaOne.getBase() > triaTwo.getBase())
			return triaOne;
		else
			return triaTwo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (Float.floatToIntBits(base) != Float.floatToIntBits(other.base))
			return false;
		if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
			return false;
		return true;
	}

	@Override
	public void draw() {
		System.out.println("TRIANGLE IS DRAWN");
	}
}
