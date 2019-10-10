package course.files.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {

        // file pathname
        File file = new File("/home/davi/in.txt");
        Scanner scan = null;

        try {
            //reading file with Scanner class
            scan = new Scanner(file);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (scan != null) {
                scan.close();
            }
        }

    }
}
