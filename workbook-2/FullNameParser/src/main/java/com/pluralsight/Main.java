package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       String[] fullName = nameParser();
       if(fullName.length > 2)
       {
           System.out.println("FirstName:" + fullName[0]);
           System.out.println("Middle Name:" + fullName[1]);
           System.out.println("Last Name:" + fullName[2]);
       }
       else
       {
           System.out.println("First Name:" + fullName[0]);
           System.out.println("Middle Name: (none)");
           System.out.println("Last Name" + fullName[1]);
       }
    }
    public static String[] nameParser()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Full Name Below");
        String fullName = scanner.nextLine();
        return fullName.split(" ");
    }
}