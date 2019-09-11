package course.chapter2.topicosbasicos;

import java.util.Scanner;

public class 	Demo007 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter three numbers:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int higher = max(a, b, c);
		
		showResults(higher);
		
		scan.close();
	}

	public static int max(int x, int y, int z) {
		int higher;

		if (x > y && x > z) {
			higher = x;
		} else if (y > z) {
			higher = y;
		} else {
			higher = z;
		}
		
		return higher;
	}
	public static void showResults(int value) {
		System.out.println("Higher number is " + "\'"+value + "\'.");
	}
}












