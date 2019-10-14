package course.lambdas4.application;

import course.lambdas4.entities.Product;
import course.lambdas4.entities.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.5));
        list.add(new Product("HD Case", 80.9));

        //implements interface function
        System.out.println("Using interface function");
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        names.forEach(System.out::println);

        //reference method static
        System.out.println("Using static method");
        List<String> names1 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        names.forEach(System.out::println);

        //reference method non static
        System.out.println("Using non static method");
        List<String> names2 = list.stream()
                .map(Product::nonStaticUpperCaseName)
                .collect(Collectors.toList());

        names.forEach(System.out::println);

        //expression lambda
        System.out.println("Using expression lambda");
        Function<Product, String> upperCaseName = p -> p.getName().toUpperCase();
        List<String> names3 = list.stream().map(upperCaseName).collect(Collectors.toList());
        names.forEach(System.out::println);

        //lambda inline
        System.out.println("Using lambda inline");
        List<String> names4 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}
