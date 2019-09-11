package course.chapter2.topicosbasicos;

import java.util.Scanner;

public class Exercise003 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite três números inteiros:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if (a > b && a > c) {
			System.out.println("Higher = " + a);
		} else if (b > c && b > a) {
			System.out.println("Higher = " + b);
		}else {
			System.out.println("Higher = " + c);
		}

		scan.close();

	}

}
