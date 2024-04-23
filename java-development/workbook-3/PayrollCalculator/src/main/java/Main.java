import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the file employee file to process: ");
        String inputFileName = scanner.nextLine();

        System.out.println("Enter the name of the payroll file to create: ");
        String outputFileName = scanner.nextLine();

        String filename = "employees.csv";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursworked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursworked, payRate);
                String outputLine = "";

                outputLine = String.format("%d|%s|%.2f%n",
                        employee.getEmployeeid(), employee.getName(), employee.getGrosspay());

                writer.write(outputLine);
            }

            writer.close();


        } catch (IOException e) {
            System.err.println("Error reading file: " + inputFileName);
            System.err.println("Error writing output file: " + outputFileName);


        }


    }
}