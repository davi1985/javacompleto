package course.chapter8.exercise.applications;

import course.chapter8.exercise.entities.Department;
import course.chapter8.exercise.entities.HourContract;
import course.chapter8.exercise.entities.Worker;
import course.chapter8.exercise.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		//date format
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

		System.out.print("Enter department's name: ");
		String departmentName = scan.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = scan.nextLine();
		System.out.print("Level: ");
		String workerLevel = scan.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = scan.nextDouble();

		//new worker
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));

		System.out.print("How many contracts to this worker?: ");
		int contracts = scan.nextInt();

		for (int i = 0; i < contracts; i++) {
			System.out.println("Enter contract #" + (i + 1) + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(scan.next());
			System.out.print("Value per hour: ");
			Double valuePerHour = scan.nextDouble();
			System.out.print("Duration (hours):");
			int hours = scan.nextInt();

			//new contract
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);

			//add contract 
			worker.addContract(contract);
			System.out.println();
		}

		System.out.println();
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = scan.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));

		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		scan.close();
	}
}
