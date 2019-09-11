package course.chapter2.topicosbasicos;

import java.util.Scanner;

public class Demo005 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an interger number: ");
		int number = scan.nextInt();

		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		scan.close();
	}

}
