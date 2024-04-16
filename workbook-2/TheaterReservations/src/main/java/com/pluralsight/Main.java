package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {


        int tickets;

       System.out.print("Number Of tickets:");
       tickets = userInput.nextInt();
       userInput.nextLine();

       displayReservation(tickets);
        getName();



    }

    public static void displayReservation(int tickets)
    {
        if (tickets > 1)
        {
            System.out.println(tickets+ " Tickets");
        }
        else
        {
            System.out.println(tickets + " Ticket");
        }

    }
    public static String  getName()
    {
        String firstName;
        String lastName;
        String name;


        System.out.println("Please Enter Full Name");
        name = userInput.nextLine();
        String[] parts = name.split(" ");
        firstName = parts[0].strip();
        lastName = parts[1].strip();
        return lastName + "," + firstName;


    }


}