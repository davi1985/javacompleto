package course.inheritance6.application;

import course.inheritance6.entities.Account;
import course.inheritance6.entities.BusinessAccount;
import course.inheritance6.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		list.add(new SavingsAccount(1001, "Davi", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Joelma", 1000.0, 500.0));
		list.add(new SavingsAccount(1003, "Sarah", 300.0, 0.01));
		list.add(new BusinessAccount(1004, "Emilly", 500.0, 500.0));

		double sum = 0.0;
		for (Account account : list) {
			sum += account.getBalance();
		}

		System.out.printf("Total balance: $ %.2f%n", sum);

		for (Account account : list) {
			account.deposit(10);
		}

		System.out.println();
		for (Account account : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", account.getNumber(), account.getBalance());
		}
	}

}
