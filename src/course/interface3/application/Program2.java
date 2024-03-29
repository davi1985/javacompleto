package course.interface3.application;

import course.interface3.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program2 {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "/home/davi/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String employeeCsv = br.readLine();

            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }

            Collections.sort(list);

            for (Employee employee : list) {
                System.out.println(employee.getName() + ", $" + String.format("%.2f", employee.getSalary()));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
