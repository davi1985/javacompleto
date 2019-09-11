package course.chapter2.topicosbasicos;

import java.util.Scanner;

public class Demo004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        char gender = sc.next().charAt(0);
        String s = sc.next();
        char letter = s.charAt(0);

        
        System.out.println(n1);
        System.out.println(name);
        System.out.println(gender);
        System.out.println(letter);

        
        sc.close();
    }
}
