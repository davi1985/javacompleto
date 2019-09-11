package course.chapter3.intropoo.application;

import java.util.Scanner;

import course.chapter3.intropoo.util.Calculator;

public class Program3 {

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a radius: ");
		double radius = scan.nextDouble();

		double circumference = Calculator.circumference(radius);
		double volume = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", circumference);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		scan.close();

	}

}
