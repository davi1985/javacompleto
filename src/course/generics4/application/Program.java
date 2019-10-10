package course.generics4.application;

import course.generics4.entities.Client;

public class Program {

    public static void main(String[] args) {

       Client c1 = new Client("Davi Silva", "dssilvap@gmail.com");
       Client c2 = new Client("Davi Silva", "dssilvap@gmail.com");
       
       System.out.println(c1.hashCode());
       System.out.println(c2.hashCode());
       System.out.println(c1.equals(c2));
       System.out.println(c1 == c2);
    }
}
