package course.inheritance5.application;

import course.inheritance5.entities.ImportedProduct;
import course.inheritance5.entities.Product;
import course.inheritance5.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data: ");
            System.out.print("Common, used or imported (c/u/i) ?");
            char typeProduct = scan.next().charAt(0);

            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Price: ");
            double price = scan.nextDouble();

            if (typeProduct == 'c') {
                list.add(new Product(name, price));

            } else if (typeProduct == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(scan.next());
                list.add(new UsedProduct(name, price, date));
            } else if (typeProduct == 'i') {
                System.out.print("Custom fees: ");
                double customFees = scan.nextDouble();
                list.add(new ImportedProduct(name,price,customFees));
            }
        }

        System.out.println();
        System.out.println("Price tags: ");
        for(Product product : list) {
            System.out.println(product.priceTag());
        }
        scan.close();
    }
}
