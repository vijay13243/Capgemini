package capgemini.oops;

class Circle {
	
	// field.....
	float radius;

	// constructors.....
	public Circle() {
		radius = 0.0f;
		System.out.println("Circle->Default constructor");
	}

	// constructor overloading....
	public Circle(float pradius) {
		radius = pradius;
		System.out.println("Circle->Parameter Constructor");
	}

	// methods.......
	public void draw() {
		System.out.println("Circle is drawn....");
	}

	public double calcArea() {
		return radius * radius * Math.PI;
	}

	// method overriding from parent object class..
	@Override // java annotation....
	public String toString() {
		return "Circle Radius:" + radius;
	}
	//if(c1.equalsto(c2)){
	 @Override
	public boolean equals (Object obj){
		Circle otherCircle= (Circle) obj;
		if(this.radius==otherCircle.radius){
			return true;
		}
		else{
			return false;
		}
	} 

}

public class Circle_Test {
	public static void main(String[] args) {

		// Object declaration.......
		Circle c1, c2;
		c1 = new Circle(5.5f);
		c2 = new Circle(5.5f);
		//Circle[] circles;
		//circles=new Circle[2];
		//circles[0]=new Circle(10f);
		//circles[1]=new Circle(10f);
		//for(Circle circle:circles){
			//circle.draw();
			//System.out.println(circle.calcArea());
		//}
		c1.draw();
		System.out.println("Area of c1: " + c1.calcArea());
		c2.draw();
		System.out.println("Area of c2: " + c2.calcArea());
		System.out.println(c1);
		System.out.println(c2);
		if(c1.equals(c2))
			System.out.println("c1 equals to c2");
		else
			System.out.println("c1  not equals to c2");
		
	}

}