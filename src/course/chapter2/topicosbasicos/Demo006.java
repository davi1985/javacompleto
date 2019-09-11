package course.chapter2.topicosbasicos;

import java.util.Scanner;

public class Demo006 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("What time is it??");
		int time = scan.nextInt();

		if (time < 12) {
			System.out.println("Good morning!");
		} else if (time >= 12 && time < 18) {
			System.out.println("Good afternoon!");
		} else if (time >= 18) {
			System.out.println("Good evening!");
		}

		scan.close();
	}
}
