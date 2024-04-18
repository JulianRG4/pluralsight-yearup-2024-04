package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        int year;
        String interiorColor;
        String exteriorColor;

        System.out.println("What year was thr house built?");
        year = userInput.nextInt();
        System.out.println();

        System.out.println("What is the interior color?");
        interiorColor = userInput.nextLine();

        System.out.println("What is the exterior color");
        exteriorColor = userInput.nextLine();


        House house1 = new House(year, interiorColor, exteriorColor);

        System.out.println("Woohoo");
        System.out.println("I have a" + house1.getOutsideColor() + "House");

        house1.paintOuside("Yellow");
    }

}