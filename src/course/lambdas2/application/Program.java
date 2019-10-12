package course.lambdas2.application;

import course.lambdas2.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // 1.predicate class
        // list.removeIf(new ProductPredicate());

        // 2. static method reference
        // list.removeIf(Product::staticProductPredicate);
        // 3. non static method reference
        // list.removeIf(Product::nonStaticProductPredicate);

        // expression lambda declared
        // Predicate<Product> pred = (p -> p.getPrice() >= 100);
        // list.removeIf(pred);

        //inline lambda
        list.removeIf(p -> p.getPrice() >= 100);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
