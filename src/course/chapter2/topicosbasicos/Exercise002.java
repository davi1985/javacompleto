package course.chapter2.topicosbasicos;

import java.util.Scanner;

public class Exercise002 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int age;
		int qtdBedrooms;
		double height;
		double productPrice;
		String fullName;
		String lastName;

		System.out.println("Enter your full name:");
		fullName = scan.nextLine();
		
		System.out.println("How many bedrooms are there on your house?");
		qtdBedrooms = scan.nextInt();
	
		System.out.println("Enter product price:");
		productPrice = scan.nextDouble();

		System.out.println("Enter your last name, age and height(same lime)");
		lastName = scan.next();
		age = scan.nextInt();
		height = scan.nextDouble();
		
		System.out.println(fullName);
		System.out.println(qtdBedrooms);
		System.out.printf("%.2f%n", productPrice);
		System.out.printf("%s, %d years old and height %.2f%n.", lastName, age, height);

		scan.close();
	}

}
