package course.inheritance4.application;

import course.inheritance4.entities.Employee;
import course.inheritance4.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = scan.next().charAt(0);

            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();

            System.out.print("Hours: ");
            int hours = scan.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = scan.nextDouble();

                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");

        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment())) ;
        }

        scan.close();
    }
}
