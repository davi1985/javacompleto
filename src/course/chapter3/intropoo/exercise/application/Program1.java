package course.chapter3.intropoo.exercise.application;

import java.util.Scanner;

import course.chapter3.intropoo.exercise.entities.Rectangle;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle with and height: ");
		rectangle.width = scan.nextDouble();
		rectangle.height = scan.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		
		scan.close();
	}

}
