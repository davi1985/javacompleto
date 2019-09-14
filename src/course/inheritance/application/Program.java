
package course.inheritance.application;

import course.inheritance.entities.Account;
import course.inheritance.entities.BusinessAccount;
import course.inheritance.entities.SavingsAccount;

public class Program {
	
	public static void main(String[] args) {
		
		Account account = new Account(8152, "Davi", 0.0);
		BusinessAccount bacc = new BusinessAccount(8022, "Joelma", 0.0, 500.00);
		
		//up casting
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(123, "Sarah", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1234, "Emilly", 0.0, 0.01);
		
		//down casting
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}		
	}
}
