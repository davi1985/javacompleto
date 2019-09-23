package course.interface1.application;

import course.interface1.model.entities.CarRental;
import course.interface1.model.entities.Vehicle;
import course.interface1.model.services.BazilTaxService;
import course.interface1.model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter a rental data: ");
        System.out.print("Car model: ");
        String carModel = scan.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
        Date start = sdf.parse(scan.nextLine());
        System.out.print("Return (dd/MM/yyyy hh:ss): ");
        Date finish = sdf.parse(scan.nextLine());

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Enter price per hour: ");
        double pricePerHour = scan.nextDouble();
        System.out.println("Enter price per day: ");
        double pricePerDay = scan.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("INVOICE: ");
        System.out.println("Basic payment: $" + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Total payment: $" + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

        scan.close();
    }
}
