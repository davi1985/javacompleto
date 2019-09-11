package course.chapter3.intropoo.exercise.application;

import java.util.Scanner;

import course.chapter3.intropoo.exercise.entities.Student;

public class Program3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Student student = new Student();
	
		System.out.println("Enter student name: ");
		student.name = scan.next();

		System.out.println("Enter three notes: ");
		student.grade1 = scan.nextDouble();
		student.grade2 = scan.nextDouble();
		student.grade3 = scan.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f points", student.missingPoints());
		}else {
			System.out.println("PASS");
		}

		scan.close();
	}

}
