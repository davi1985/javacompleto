package course.chapter5.list.exercise.application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

import course.chapter5.list.exercise.entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		// reading data;
		System.out.println("How many employees will be registered? ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1));
			System.out.print("ID: ");
			int id = scan.nextInt();

			System.out.println("Name: ");
			scan.nextLine();
			String name = scan.nextLine();

			System.out.println("Salary: ");
			double salary = scan.nextDouble();

			list.add(new Employee(id, name, salary));
		}

		// increase salary

		System.out.print("Enter the employee ID that will have increase salary: ");
		int id = scan.nextInt();

		Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (employee == null) {
			System.out.println("This ID that does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = scan.nextDouble();
			employee.increaseSalary(percentage);
		}

		System.out.println();
		for (Employee obj : list) {
			System.out.println(obj);
		}

		scan.close();
	}

}
