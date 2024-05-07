package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        Room room1 = new Room(2, 150,false, false );

        System.out.println();
        System.out.println("Hotel Main office");
        System.out.println("[1] To Check in");
        switch (userInput.nextInt())
        {

            case 1:
                room1.checkIn();
                break;
            case 2:

        }


    }



}
