package course.generics3.application;

import java.util.ArrayList;
import java.util.List;

import course.generics3.entities.Circle;
import course.generics3.entities.Rectangle;
import course.generics3.entities.Shape;

public class Program2 {
	
	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3, 3));
		myShapes.add(new Circle(3));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(5));
		myCircles.add(new Circle(2.5));
		
		System.out.println(String.format("%.2f",totalArea(myShapes)));
		System.out.println(String.format("%.2f",totalArea(myCircles)));

	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape shape : list) {
			sum += shape.area();
		}
		return sum;
		
	}

}
