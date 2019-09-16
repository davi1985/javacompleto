package course.inheritance8.application;

import course.inheritance8.entities.Company;
import course.inheritance8.entities.Individual;
import course.inheritance8.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or Company (i/c)? ");
            char type = scan.next().charAt(0);

            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Anual Income: ");
            double anualIncome = scan.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = scan.nextDouble();

                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of Employees: ");
                int numberOfEmployees = scan.nextInt();

                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAIDS: ");
        for (TaxPayer taxPayer : list) {
            double tax = taxPayer.tax();
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f",taxPayer.tax()));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAX:");
        System.out.println(String.format("%.2f", sum));

        scan.close();
    }
}
