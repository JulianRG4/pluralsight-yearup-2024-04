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
        userInput.nextLine();

        System.out.println("What is the interior color?");
        interiorColor = userInput.nextLine();

        System.out.println("What is the exterior color");
        exteriorColor = userInput.nextLine();


        House house1 = new House(year, interiorColor, exteriorColor);

        displayInfo(house1);


        System.out.println("woohoo");
        System.out.println("I have a " + house1.getInsideColor() + " house");
        System.out.println("I have a " + house1.getOutsideColor() + " house");
    }
    public static void displayInfo(House house)
    {
        System.out.println();
        System.out.println("Year: " + house.getYearBuilt());
        System.out.println("Interior: " + house.getInsideColor());
        System.out.println("Exterior: " + house.getOutsideColor());
    }

}