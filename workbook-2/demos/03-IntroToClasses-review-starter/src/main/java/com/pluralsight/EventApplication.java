package com.pluralsight;

import com.pluralsight.models.*;

import java.util.Scanner;

public class EventApplication
{
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        Person eventGoer = register();
        System.out.println(eventGoer.getFirstName());

        greetGuest(eventGoer);

    }

    public static Person register()
    {
        //declare variables
        String fullName, firstName, lastName;
        int age;

        //get user input
        System.out.print("Please enter your full name: ");
        fullName = userInput.nextLine();
        System.out.print("Please enter your age: ");
        age = userInput.nextInt();
        userInput.nextLine(); //clears the memory stream

        //get first and last names
        String[] names = fullName.split(" ");
        firstName = names[0];
        lastName = names[1];

        // create a person
        Person person = new Person(firstName,lastName,age);
        return person;
    }

    public static void greetGuest(Person guest)
    {
        System.out.println();


    }
}