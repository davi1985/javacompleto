package course.chapter8.exercise2.application;

import course.chapter8.exercise2.entities.Client;
import course.chapter8.exercise2.entities.Order;
import course.chapter8.exercise2.entities.OrderItem;
import course.chapter8.exercise2.entities.Product;
import course.chapter8.exercise2.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //data to new client
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scan.next());

        // new client
        Client client = new Client(name, email, birthDate);
        System.out.println();

        //order status
        System.out.println("Enter order data: ");
        System.out.print("Status:");
        OrderStatus status = OrderStatus.valueOf(scan.next());

        //new order status
        Order order = new Order(new Date(), status, client);


        System.out.println("How many items to this order? ");
        int n = scan.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i + 1) + " data:");
            System.out.print("Product name: ");
            scan.nextLine();
            String productName = scan.nextLine();
            System.out.print("Product price: ");
            double productPrice = scan.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int productQuantity = scan.nextInt();

            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMARY: ");

        System.out.println(order);

        scan.close();
    }
}
