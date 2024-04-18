package com.pluralsight;

import java.util.Scanner;

public class LoopTypes
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String [] args)
    {
      whileLoop();

    }
    public static void whileLoop()
    {
        String playAgain = "y";

        while (playAgain.equalsIgnoreCase("y"))
        {
            System.out.println();
            System.out.println("Welcome to my game");
            System.out.println("-------------------");

            System.out.println();
            System.out.println("Do you want to play again? (y/n) ");
            playAgain = userInput.nextLine().toLowerCase();
        }


        System.out.println();
        System.out.println("Thanks for Playing! Come again");
    }
}
