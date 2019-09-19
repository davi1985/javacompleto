package course.files.application;

import java.io.File;
import java.util.Scanner;

public class Demo5 {

    public static void main(String[] args) {
        /*
          Manipulating Folders with File
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = scan.nextLine();
        File path = new File(strPath);

        System.out.println();

        //refernce methods File::isDirectory
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");

        if (folders != null) {
            for (File folder : folders) {
                System.out.println(folder);
            }
        }

        System.out.println();
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        if (files != null) {
            for (File file : files) {
                System.out.println(file);
            }
        }

        //creating a folder
        boolean success = new File(strPath + "/subdir2").mkdir();
        System.out.println("Directory created successfully: " + success);
    }
}
