package com.pluralsight;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static ArrayList<Employee> employees =new ArrayList<>();

    public static void main(String[] args)
    {
        loadEmployees();
        displayAllEmployees();


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
        System.out.println("-".repeat(70));
        System.out.println("Id:             Name:             Hours Payed:           Pay Rate: ");

        for(Employee employee : employees)
        {
            printEmployees(employee);
        }
    }

    public static void printEmployees(Employee employee)
    {
        System.out.printf("%-15s %-20s %-20.2f %-20.2f\n", employee.getiD(),employee.getName(),employee.getHoursWorked(),employee.getPayRate());
    }

}