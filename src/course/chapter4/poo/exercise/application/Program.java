package course.chapter4.poo.exercise.application;

import java.util.Scanner;

import course.chapter4.poo.exercise.entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int accountNumber;
		String holder;
		double initialDeposit;
		char response;
		double depositValue;
		double withdrawValue;

		System.out.print("Enter account number: ");
		accountNumber = scan.nextInt();

		System.out.print("Enter account holder: ");
		scan.nextLine();
		holder = scan.nextLine();

		System.out.print("Is there an initial deposit (y/n): ");
		response = scan.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialDeposit = scan.nextDouble();
		}else {
			initialDeposit = 0.0;
		}
		
		Account account = new Account(accountNumber, holder, initialDeposit);
		System.out.println();
		System.out.println("Account data:");
		System.out.print(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		depositValue = scan.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.print(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		withdrawValue = scan.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.print(account);

		scan.close();
	}

}
