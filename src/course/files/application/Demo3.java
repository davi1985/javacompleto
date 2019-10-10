package course.files.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo3 {

    public static void main(String[] args) {

        //file pathname
        String path = "/home/davi/in.txt";

        // try/catch with resources
        try (BufferedReader br = new BufferedReader( new FileReader(path))){

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
