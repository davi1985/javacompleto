package course.chapter5.poo.vetor.application;

import course.chapter5.poo.vetor.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Rent[] vect = new Rent[10];

        System.out.println("How many rooms will be rented? ");
        int rented = scan.nextInt();

        for (int i = 0; i < rented; i++) {
            System.out.println("Rented #" + (i + 1) + ":");
            scan.nextLine();
            
            System.out.print("Name:");
            String name = scan.nextLine();
            
            System.out.print("Email:");
            String email = scan.nextLine();
            
            System.out.print("Room:");
            int room = scan.nextInt();
            
            vect[room] = new Rent(name, email);
            System.out.println();
        }

        System.out.println();

        System.out.println("Busy rooms: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": "+ vect[i]);
            }
        }
        scan.close();
    }
}
