package course.map2.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> votes = new LinkedHashMap<>();

        //file path
        System.out.print("Enter file full path: ");
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            //reading file
            String line = br.readLine();

            // when the line is not null
            while (line != null) {
                //splitting the file based on comma
                String[] fields = line.split(",");

                //index zero receives - name
                String name = fields[0];
                //index one receives - quantity of votes
                int count = Integer.parseInt(fields[1]);

                // if there is votes in name key
                if (votes.containsKey(name)) {
                    // stores the value in variable votesSoFar
                    int votesSoFar = votes.get(name);
                    //put a new value added the count value with votesSoFar
                    votes.put(name, count + votesSoFar);
                } else {
                    votes.put(name, count);
                }
                line = br.readLine();
            }

            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
