package com.pluralsight;


import java.util.Scanner;

public class Main
{
    public static  Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        String firstName = firstName();
        String middleName = middleName();
        String lastName = lastName();
        String suffix = suffix();
        fullName(firstName, middleName,lastName,suffix);


    }
    public static String firstName()
    {
        System.out.print("First Name:");
        String firstName = userInput.nextLine().strip();
        return firstName;

    }
    public static String middleName()
    {
        System.out.print("Middle Name:");
        String middleName = userInput.nextLine().strip();
        if (!middleName.isEmpty())
        {
            middleName += ".";
        }
        return middleName;
    }
    public static String lastName()
    {
        System.out.print("last Name:");
        String lastName = userInput.nextLine().strip();
        return lastName;
    }
    public static String suffix()
    {
        System.out.print("Suffix:");
        String suffix = userInput.nextLine().strip();

        return suffix;
    }
    public static void fullName(String firstName, String middleName, String lastname, String suffix)
    {
        if(!suffix.isEmpty())
        {
            lastname += ",";
        }

        String fullName = "Full Name:" + firstName + " " + middleName + " " + lastname + " " +suffix;
        fullName = fullName.replace("  "," ");
        System.out.println(fullName);
    }


}