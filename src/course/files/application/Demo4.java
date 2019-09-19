package course.files.application;

import java.io.*;

public class Demo4 {

    public static void main(String[] args) {
        //writing file;
        String[] lines = new String[]{"Good morning", "Good afertnoon", "Good night"};

        String path = "/home/davi/out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //reading file written
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
