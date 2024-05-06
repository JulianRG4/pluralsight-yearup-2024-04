package com.pluralsight;

import java.util.Scanner;

public class Main
{
//    Write a Java program and compute the sum of an integer's digits.
//    Input Data:
//    Input an integer: 25
//    Expected Output
//
//    The sum of the digits is: 7

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = userInput.nextInt();
        int sum = 0;

        while (number != 0 )
        {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);


    }
}