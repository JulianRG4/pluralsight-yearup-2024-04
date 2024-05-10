package com.pluralsight;

import java.util.Scanner;

public class Main
{
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter a Number: ");
        int first = userInput.nextInt();
        System.out.println("Enter another Number: ");
        int second = add(5, 6);

    }

    public static int add(int a, int b)
    {
        return a + b;
    }
}