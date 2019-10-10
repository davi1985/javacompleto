package course.generics.application;

import course.generics.services.PrintService;

import java.util.Scanner;

public class Program {
    /**
     * Generics permitem que classes, interfaces e métodos possam ser parametrizados por tipo.
     * Seus benefícios são:
     * -> Reuso
     * -> Type safety
     * -> Performace
     *
     * Uso comum: coleções
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //instance of PrintService
        PrintService<String> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        String x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}
