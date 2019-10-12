package course.lambdas3.application;

import course.lambdas3.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

//         using Comsumer class
//       list.forEach(new PriceUpdate());

//         with static method
//       list.forEach(Product::staticPriceUpdate);
//        with non static method
        list.forEach(Product::nonStaticPriceUpdate);
       Consumer<Product> cons = product -> product.setPrice(product.getPrice() * 1.1);
        list.forEach(cons);
//        list.forEach(product -> product.setPrice(product.getPrice() * 1.1));

        list.forEach(p -> p.setPrice(p.getPrice() * 1.1
        ));

        list.forEach(System.out::println);
    }
}
