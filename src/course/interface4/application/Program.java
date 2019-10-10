package course.interface4.application;

import java.util.Locale;
import java.util.Scanner;

import course.interface4.services.BrazilInterestService;
import course.interface4.services.InterestService;
import course.interface4.services.UsaInterestService;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = scan.nextDouble();

        System.out.print("Months: ");
        int months = scan.nextInt();

        InterestService interestService = new UsaInterestService(1.0);
        double payment = interestService.payment(amount, months);
        
        System.out.println("Payment after " + months + " months: (USA interest)");
        System.out.println(String.format("$ %.2f", payment));

        
        InterestService interestService2 = new BrazilInterestService(2.0);
        double payment2 = interestService2.payment(amount, months);

        System.out.println("Payment after " + months + " months: (Brazil interest)");
        System.out.println(String.format("$ %.2f", payment2));

        
        scan.close();
    }
}
