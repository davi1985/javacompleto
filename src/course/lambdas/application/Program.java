package course.lambdas.application;

import course.lambdas.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        /**
         * Comparator objeto de classe separada
         * Comparator objeto de classe anônima
         * Comparator objeto de expressão lambda com chaves
         * Comparator objeto de expressão lambda sem chaves
         * Comparator expressão lambda "direto no argumento"
         */


        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));

        //first version - anonymous class
//        Comparator<Product> comp = new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//            }
//        };

        // expression lambda (arrow functions)
//        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        //third version
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
