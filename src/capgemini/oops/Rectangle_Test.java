package capgemini.oops;

class Rectangle{
	// fields
	float length, breadth;
	
	// constructors
	public Rectangle(){
		length=breadth=0.0f;
		System.out.println("Rectangle->Default constructor");
	}
	// constructor overloading....
		public Rectangle(float plength, float pbreadth) {
			length = plength;
			breadth=pbreadth;
			System.out.println("Rectangle->Parameter Constructor");
}
		// methods.......
		public void draw() {
			System.out.println("Rectangle is drawn....");
		}

		public double calcArea() {
			return length*breadth;
		}

		// method overriding from parent object class..
		@Override // java annotation....
		public String toString() {
			return "Length:" +length+ "Breadth :" +breadth;
		}
		//equal overriding
		 @Override
		public boolean equals (Object obj){
			Rectangle otherRectangle= (Rectangle) obj;
			if(this.length==otherRectangle.length && this.breadth==otherRectangle.breadth){
				return true;
			}
			else{
				return false;
			}
		} 
}


public class Rectangle_Test {
	public static void main(String[] args) {

		// Object declaration.......
		Rectangle r1, r2;
		r1 = new Rectangle(5.5f,6.5f);
		r2 = new Rectangle(5.5f , 6.5f );
		r1.draw();
		System.out.println("Area of r1: " + r1.calcArea());
		r2.draw();
		System.out.println("Area of r2: " + r2.calcArea());
		System.out.println(r1);
		System.out.println(r2);
		if(r1.equals(r2))
			System.out.println("r1 equals to r2");
		else
			System.out.println("r1  not equals to r2");
		
}

}
