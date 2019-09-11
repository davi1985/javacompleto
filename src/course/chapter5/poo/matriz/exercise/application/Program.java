package course.chapter5.poo.matriz.exercise.application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter M: ");
		int m = scan.nextInt();
		System.out.println();

		System.out.print("Enter N: ");
		int n = scan.nextInt();

		int[][] mat = new int[m][n];

		System.out.println("Enter numbers: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = scan.nextInt();
			}
		}

		System.out.println("Choice a number: ");
		int choice = scan.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (choice == mat[i][j]) {
					System.out.println("Position: " + i + "," + j + ": ");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}

		scan.close();
	}

}
