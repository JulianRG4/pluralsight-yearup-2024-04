package com.pluralsight;

public class ExerciseDemo
{
    public static void main(String[] args)
    {
        question1();
        question2();
    }

    public static void question1()
    {
        // calculate the amount of change given after buying chocolate
        // chocolate cost 2.99 per bar
        // I have $20
        // Buy 4 bars of chocolate
        // how much change do I get back

        double balance = 20;
        double priceOfChocolate = 2.99;
        int quantityBought =4;
        double totalCost;
        double changeGiven;

        totalCost = priceOfChocolate * quantityBought;
        changeGiven = balance - totalCost;

        System.out.println();
        System.out.println("Chocolate: $" + priceOfChocolate);
        System.out.println("Quantity: " + quantityBought);
        System.out.println("----------");
        System.out.println("Total: $" + totalCost);
        System.out.println("Paid: $" + balance);
        System.out.println("Change Given: $" + (balance = (priceOfChocolate * quantityBought)));

        }




    public static void question2()
    {
        // calculate the perimeter of a circle
        // for a circle with a radius of 12

        //v variables
        double radius =12;
        double perimeter;

        // calculate
        perimeter = 2 * Math.PI * radius;

        //output
        System.out.println("The Perimeter of the circle with a radius of " + radius + "is "  + perimeter );


    }

}

