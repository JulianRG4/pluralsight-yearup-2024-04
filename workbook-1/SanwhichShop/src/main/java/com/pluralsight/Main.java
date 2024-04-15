package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
       final int regularSandwich = 1;
       final double regularSandwichPrice = 5.45;
       final int largeSandwich = 2;
       final double largeSandwichPrice = 8.95;


        System.out.println("Sandwich Shop Menu");
        System.out.println("(1)Regular:5.45 | (2)Large:8.95");
        int sandwichSize = userInput.nextInt();

        System.out.println("Enter age");
        int age = userInput.nextInt();

        double discount;
        if (age <= 17) {
            discount = 0.1;
        } else if (age >= 65) {
            discount = 0.2;
        } else {
            discount = 0.0;
        }

        double totalPrice;
        if (sandwichSize == regularSandwich) {
            totalPrice = regularSandwichPrice * (1 - discount);
        } else if (sandwichSize == largeSandwich) {
            totalPrice = largeSandwichPrice * (1 - discount);
        }  else {
            System.out.println("Please input valid request");
            return;
        }

        System.out.println("Total Price: $" + String.format("%.2f",totalPrice));





    }
}