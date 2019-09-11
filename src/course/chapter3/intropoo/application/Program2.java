package course.chapter3.intropoo.application;

import java.util.Locale;
import java.util.Scanner;

import course.chapter3.intropoo.entities.Product;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Product product = new Product();

		System.out.println("Enter product data: ");

		System.out.println("Name: ");
		product.name = scan.next();

		System.out.println("Price: ");
		product.price = scan.nextDouble();

		System.out.println("Quantity in stock: ");
		product.quantity = scan.nextInt();

		System.out.println("Product data: " + product);

		System.out.println("Enter the number of products to be added in stock: ");
		product.addProduct(scan.nextInt());

		System.out.println("Updated data: " + product);

		System.out.println("Enter the number of products to be removed from stock: ");
		product.removeProduct(scan.nextInt());

		System.out.println("Updated data: " + product);

		scan.close();
		

	}

    public static class Program4 {

        public static final double PI = 3.14159;

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a radius: ");
            double radius = scan.nextDouble();

            double circumference = circumference(radius);
            double volume = volume(radius);

            System.out.printf("Circumference: %.2f%n", circumference);
            System.out.printf("Volume: %.2f%n", volume);
            System.out.printf("PI value: %.2f%n", PI);

            scan.close();

        }

        public static double circumference(double radius) {
            return 2.0 * PI * radius;
        }

        public static double volume(double radius) {
            return 4.0 * PI * Math.pow(radius, 3) / 3.0;
        }

    }
}
