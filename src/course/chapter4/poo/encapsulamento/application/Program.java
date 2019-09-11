package course.chapter4.poo.encapsulamento.application;

import java.util.Scanner;

import course.chapter4.poo.encapsulamento.entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;
		double price;
		int quantity;
		Product p = new Product();
		

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		name = sc.nextLine();

		System.out.print("Price: ");
		price = sc.nextDouble();
		
		p.setName("Computer");
		System.out.println("Updated name: " + p.getName());

//		System.out.print("Quantity in stock: ");
//		quantity = sc.nextInt();

		Product product = new Product(name, price);
		System.out.println();

		System.out.println("Product data: " + product);
		System.out.println();

		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();

		System.out.println("Updated data: " + product);
		System.out.println();

		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();
	}
}