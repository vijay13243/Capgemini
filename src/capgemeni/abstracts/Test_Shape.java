package capgemeni.abstracts;

abstract class Shape {
	public Shape() {
		super(); // will call def const of object class....
		System.out.println("Shape->def....");
	}

	public void draw() {
		System.out.println("Shape is draw....");
	}

	public abstract double calcArea();

	@Override
	public String toString() {
		return "shape:->";
	}

}

class Circle extends Shape {
	// field
	float radius;
	// def const......

	public Circle() {
		super(); // will call def const of shape class...
		System.out.println("Circle->def.....");
	}

	// param const..
	public Circle(float radius) {
		super(); // will call def const of shape class...
		this.radius = radius;
	}

	@Override
	public void draw() {
		super.draw(); // will call def const of shape class...
		System.out.println("Circle is draw....");
	}

	@Override
	public double calcArea() {
		return radius * radius * Math.PI;
	}

	// to string
	@Override
	public String toString() {
		// super.toString() will call toString from shape class
		return super.toString() + "Circle [radius=" + radius + "]";
	}

	// equals method
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
		public void showCircle(){
			System.out.println("I am Circle");
		}
	}

public class Test_Shape {
	public static void main(String[] args) {
		Shape shape;
		Circle circle = new Circle(10f);
		circle.draw();
		circle.calcArea();
		circle.showCircle();
		shape = circle;
		System.out.println(shape.calcArea());
		System.out.println(shape);
		Shape shap =new Circle();
		shap.draw();
		shap.calcArea();
		//shap.showCircle();
		
	}
}
