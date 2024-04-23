package com.pluralsight;

import java.util.Scanner;

public class Main {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        String[] famousQuotes = {
                "\"The only true wisdom is in knowing you know nothing.\" - Socrates",
                "\"Love is composed of a single soul inhabiting two bodies.\" - Aristotle",
                "\"Hope is the thing with feathers that perches in the soul and sings the tune without the words and never stops at all.\" - Emily Dickinson",
                "\"Success is not final, failure is not fatal: It is the courage to continue that counts.\" - Winston Churchill",
                "\"Creativity is intelligence having fun.\" - Albert Einstein",
                "\"A friend is someone who knows all about you and still loves you.\" - Elbert Hubbard",
                "\"Change your thoughts and you change your world.\" - Norman Vincent Peale",
                "\"Be the change that you wish to see in the world.\" - Mahatma Gandhi",
                "\"Gratitude can transform common days into thanksgivings, turn routine jobs into joy, and change ordinary opportunities into blessings.\" - William Arthur Ward",

        };quotesNumbered(famousQuotes);

    }

    public static void quotesNumbered(String[] famousQuotes)
    {
        int numberedQuotes = 1;
        {
            try
            {
                System.out.println("Enter a number 1 - 10");
                String numberedQuotInput = userInput.next();
                numberedQuotes = Integer.parseInt(numberedQuotInput);

                numberedQuotes--;
                System.out.println(famousQuotes[numberedQuotes]);
            }
            catch (ArrayIndexOutOfBoundsException error)
            {
                System.out.println("Sorry, invalid input");

            }
            catch (NumberFormatException error)
            {
                System.out.println("Sorry, invalid input ");
            }



        }
    }
}

