package course.inheritance7.application;

import course.inheritance7.entities.Circle;
import course.inheritance7.entities.Rectangle;
import course.inheritance7.entities.Shape;
import course.inheritance7.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data:");
            System.out.print("Rectangle or Circle (r/c)?");
            char type = scan.next().charAt(0);
            System.out.print("Color (BLACK/RED/BLUE): ");
            Color color = Color.valueOf(scan.next());

            if (type == 'r') {
                System.out.print("Width: ");
                double width = scan.nextDouble();
                System.out.print("Height: ");
                double height = scan.nextDouble();

                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = scan.nextDouble();

                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list) {
            System.out.printf("%.2f%n",shape.area());
        }


        scan.close();
    }

}
