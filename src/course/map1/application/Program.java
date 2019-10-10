package course.map1.application;

import course.map1.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        //key - products, quantity in stock
        Map<Product, Double> products = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        products.put(p1, 10000.0);
        products.put(p2, 20000.0);
        products.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        /**
         * se não tiver o equal e hashCode na classe, o Map
         * vai comparar pela refência de ponteiros...
         */
        System.out.println("Contayns 'ps' key: " + products.containsKey(ps));
    }
}
