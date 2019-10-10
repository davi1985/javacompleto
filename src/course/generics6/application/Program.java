package course.generics6.application;

import course.generics6.entities.Product;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {


        // comaração com HashSet<>();
        // Se hashCode e equals NÃO estiverem implementados:
        // Compara as referências (ponteiros) dos objetos.
        Set<Product> set = new HashSet<>();

        set.add(new Product("TV",900.0));
        set.add(new Product("Notebook",1200.0));
        set.add(new Product("Tablet",400.0));

        Product product = new Product("Notebook", 1200.0);

        System.out.println(set.contains(product));

        // sem a implementação do equals e hashCode - false;
        // com a implementação - true;

    }
}
