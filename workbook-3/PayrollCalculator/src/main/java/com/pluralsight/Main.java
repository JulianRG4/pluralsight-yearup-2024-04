package com.pluralsight;

import javax.naming.NamingEnumeration;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static ArrayList<Employee> employees =new ArrayList<>();

    public static void main(String[] args)
    {
        loadEmployees();
        displayAllEmployees();
        String[] grossPay = {"GrossPay"};
        writeToFile(grossPay);


    }

    public static void writeToFile(String[] words)
    {
        File file = new File("File/PayrollGrossPay.csv");

        try(FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter writer = new PrintWriter(fileWriter)
        )
        {
            for(String line : words)
            {
                writer.println(line);
            }
        }
        catch (IOException ex)
        {
            System.out.println("Sorry, we encountered an error");
        }

    }



    public static void loadEmployees()
    {
        File file = new File("File/employees.csv");

        try(Scanner fileScanner = new Scanner(file))
        {
            fileScanner.nextLine();

            while (fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();

                String[] colums = line.split("[|]");

                String iD = colums[0];
                String names = colums[1];
                double hoursWorked = Double.parseDouble(colums[2]);
                double payRate = Double.parseDouble(colums[3]);

                Employee employee = new Employee(iD, names, hoursWorked, payRate);

                employees.add(employee);
            }
        }
        catch (IOException ex)
        {


        }

    }

    public static void displayAllEmployees()
    {
        System.out.println();
        System.out.println("All employees");
        System.out.println("-".repeat(90));
        System.out.println("Id:             Name:             Hours worked:           Pay Rate:            Gross pay");

        for(Employee employee : employees)
        {
            printEmployees(employee);
        }
    }

    public static void printEmployees(Employee employee)
    {
        System.out.printf("%-15s %-20s %-20.2f %-20.2f %-20.2f\n", employee.getiD(),employee.getName(),employee.getHoursWorked(),employee.getPayRate(), employee.getGrossPay());
    }

}