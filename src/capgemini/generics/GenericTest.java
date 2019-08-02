package capgemini.generics;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
	abstract void Draw();
}

class Rectangle extends Shape {
	@Override
	void Draw() {
		System.out.println("RECTANGLE DRAWN");
	}
}

class Circle extends Shape {
	@Override
	void Draw() {
		System.out.println("Circle DRAWN");
	}

}

public class GenericTest {
	// creating a method that accepts only child class of shape
	public static void drawShapes(List<? extends Shape> lists) {
		for (Shape shape : lists) {
			shape.Draw(); // calling method of shape class by child class
			// instantiation

		}
	}

	public static void main(String args[]) {
		List<Rectangle> listRectangle = new ArrayList<Rectangle>();
		listRectangle.add(new Rectangle());
		List<Circle> listCircle = new ArrayList<Circle>();
		listCircle.add(new Circle());
		drawShapes(listRectangle);
		drawShapes(listCircle);
	}
}
