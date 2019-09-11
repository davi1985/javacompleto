package course.chapter2.topicosbasicos;

import java.util.Scanner;

public class Demo008 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many integer numbers are you going to enter??");
        int number = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            System.out.println("Value #" + (i + 1));
            int value = scan.nextInt();
            sum += value;
        }
        System.out.println("Sum = " + sum);
        scan.close();
    }
}
