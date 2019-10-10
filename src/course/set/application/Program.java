package course.set.application;

import course.set.entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        // comaração com TreeSet<>();
        // a classe precisa implementar a classe Comparable<T>
        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        for (Product p : set) {
            System.out.println(p);
        }
    }
}
