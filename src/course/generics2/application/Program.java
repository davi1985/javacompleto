package course.generics2.application;

import course.generics2.entities.Product;
import course.generics2.services.CalculateService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) throws FileNotFoundException {
        /**
         * Genericos delimitadores
         */
        List<Product> list = new ArrayList<>();
        String path = "/home/davi/java-file/products-price.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            //reading file
            while (line != null) {
                // associating file with Product class
                String[] fields = line.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                list.add(new Product(name, price));

                line = br.readLine();
            }

            // using Calculate Service
            Product x = CalculateService.max(list);
            System.out.println("Most Expansive: ");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
