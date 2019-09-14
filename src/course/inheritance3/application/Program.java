package course.inheritance3.application;

import course.inheritance3.entities.Account;
import course.inheritance3.entities.BusinessAccount;
import course.inheritance3.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Davi", 1000.0);

		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());

		Account acc2 = new SavingsAccount(1002, "Sarah", 1000.0, 0.01);

		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());

		Account acc3 = new BusinessAccount(1003, "Joelma", 1000.0, 500.0);

		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
