package course.chapter3.intropoo.exercise.application;

import java.util.Scanner;

import course.chapter3.intropoo.exercise.util.CurrencyConverter;

public class Program4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the dollar price ?");
		double dollarPrice = scan.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double amount = scan.nextDouble();
		
		double dollarToReal = CurrencyConverter.dollarToReal(amount, dollarPrice);
		
		System.out.printf("Amount to be paid in reais: R$ %.2f%n", dollarToReal);
		
		scan.close();
	}
}
