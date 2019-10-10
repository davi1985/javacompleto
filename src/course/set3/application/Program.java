package course.set3.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.printf("How many students for course A: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Student code: ");
            int number = scanner.nextInt();
            a.add(number);
        }

        System.out.print("How many students for course B: ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Student code: ");
            int number = scanner.nextInt();
            a.add(number);
        }

        System.out.print("How many students for course C: ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Student code: ");
            int number = scanner.nextInt();
            a.add(number);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.print("Total students: " + total.size());
        scanner.close();
    }
}
