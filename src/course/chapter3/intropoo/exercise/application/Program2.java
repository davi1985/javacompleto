package course.chapter3.intropoo.exercise.application;

import java.util.Scanner;

import course.chapter3.intropoo.exercise.entities.Employee;

public class Program2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Employee employee = new Employee();
		double percentage;
		
		System.out.println("Name: ");
		employee.name = scan.next();

		System.out.println("Gross salary: ");
		employee.grossSalary = scan.nextDouble();

		System.out.println("Tax: ");
		employee.tax = scan.nextDouble();

		System.out.println("Employee: " + employee);
		
		System.out.println("Which percentage to increase salary?");
		percentage = scan.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Update data: " + employee);

		scan.close();
	}
}
