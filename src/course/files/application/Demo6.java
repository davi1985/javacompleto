package course.files.application;

import java.io.File;
import java.util.Scanner;

public class Demo6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = scan.nextLine();

        File path = new File(strPath);

        //getting file name
        System.out.println("getName: " + path.getName());

        //getting (only) file path
        System.out.println("getParent: " + path.getParent());

        //getting full file path
        System.out.println("getPath: " + path.getPath());

        scan.close();
    }
}
