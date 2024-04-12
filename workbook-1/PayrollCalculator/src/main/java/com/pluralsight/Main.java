package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner userinput = new Scanner(System.in);

        // Declare Variables
        double regularHoursWorked;
        double payRate;
        String customerName;
        double grossPay;



        // system.out.println
        System.out.println("Payroll Calculator ");
        System.out.println("Please enter information below ");

        System.out.print("Name: ");
        customerName =userinput.nextLine();

        System.out.print("Total hours worked: ");
        regularHoursWorked = userinput.nextDouble();

        System.out.print("Pay rate: ");
        payRate = userinput.nextDouble();

        grossPay = regularHoursWorked * payRate;

        System.out.printf("%s, your total gross pay is: \n%.2f", customerName, grossPay);

    }
}