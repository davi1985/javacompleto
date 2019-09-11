package course.chapter5.poo.vetor;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number index vetor: ");
		int n = scan.nextInt();

		double[] vect = new double[n];

		System.out.println("Enter values for vetor: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Value #" + (i + 1) + ": ");
			vect[i] = scan.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}

		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		scan.close();
	}

}
