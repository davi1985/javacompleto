package course.chapter5.poo.vetor.application;

import course.chapter5.poo.vetor.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number products: ");
        int n = scan.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            scan.nextLine();
            System.out.println("Product #" + (i+1) +" name: ");
            String name = scan.nextLine();
            System.out.println("Product #" + (i+1) +" price: ");
            double price = scan.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE: %.2f%n", avg);
        scan.close();
    }

}
