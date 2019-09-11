package course.chapter2.topicosbasicos;

import java.util.Scanner;

public class Exercise004 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = scan.nextInt();

        while (n <= 0) {
            System.out.println("N must be positive! Try again: ");
            n = scan.nextInt();
        }

        int higher = Integer.MIN_VALUE;
        for (int i = 1; i <= n ; i++) {
            System.out.println("Value #" + i + ": ");
            int x = scan.nextInt();
            if(x > higher) {
                higher = x;
            }
        }

        System.out.println("Higher = " + higher);

        scan.close();
    }
}
