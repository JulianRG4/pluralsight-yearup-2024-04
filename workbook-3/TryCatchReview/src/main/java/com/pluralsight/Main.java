package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {

        try
        {
            divide();

        }
        // this is where you put the solution/ error message when it catches something that would disrupt the code
        catch (Exception ex)
        {
            System.out.println("Sorry, something went wrong");
        }
    }

    public static void divide()
    {
        System.out.print("Enter a number:");
        int numerator = userInput.nextInt();



        System.out.println("Enter another number");
        int denominator = userInput.nextInt();

        if (denominator == 0) {
            System.out.println("Sorry, we can't decide by 0");
        }
        else
        {
            int quotient = numerator / denominator;
            System.out.printf("%d / %d = %d \n", numerator, denominator, quotient);

        }
    }
}