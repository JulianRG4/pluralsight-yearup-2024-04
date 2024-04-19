package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        // create an array of vehicles here
        Vehicle[] vehicles = {
                new Vehicle( 101121,"Ford Explorer","Red",45000,13500),
                new  Vehicle(101122,"Toyota Camry","Blue",60000,11000),
                new  Vehicle(101123,"Chevrolet Malibu","Black",50000,9700),
                new  Vehicle( 101124,"Honda Civic","White",70000,7500),
                new Vehicle(101125,"Subaru Outback","Green",55000,14500),
                new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000)
        };


        int choice = 0;
        while(choice != 6)
        {
            // print the home screen

            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println();
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.println();
            System.out.println("Enter your command");
            choice = Integer.parseInt(userInput.nextLine());

            switch(choice)
            {
                case 1:
                    // call the list all vehicles (pass the array)
                    // listAllVehicles(vehicles);
                    listAllVehicles(vehicles);


                    break;
                case 2:
                    // call the search by make/model
                    searchByMakeModel(vehicles);
                    break;
                case 3:
                    // call the search by price
                    searchByPrice(vehicles);
                    break;
                case 4:
                    // call the search by color
                    searchByColor(vehicles);
                    break;
                case 5:
                    // add a vehicle
                    vehicles = addVehicle(vehicles);
                    break;
                case 6:
                    System.out.println();
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid selection");
                    break;
            }
            System.out.println();
            System.out.println("Press Enter to continue");
            userInput.nextLine();

        }


    }

    public static void listAllVehicles(Vehicle[] vehicles)
    {
        // loop through vehicles and print all
        System.out.println();
        System.out.println("All Athletes");
        System.out.println("-------------------");


        for(int i = 0; i < vehicles.length; i++){
            Vehicle vehicle = vehicles[i];
            System.out.printf("%-20d, %-20s, %-20s, %-20d, %-20f\n", vehicle.getVehicleId(),vehicle.getMakeModel(),vehicle.getColor(),vehicle.getOdometerReading(),vehicle.getPrice());
        }
    }

    public static void searchByMakeModel(Vehicle[] vehicles)
    {
        // get user search criteria
        System.out.println();
        System.out.println("Search by Make and Model");
        System.out.println("-------------------");
        String serchMakeModel = userInput.nextLine();

        // loop through vehicles and print only vehicles that match the search
        for(int i = 0; i < vehicles.length; i++ ) {
            Vehicle vehicle = vehicles[i];
            System.out.printf("%-20s",vehicle.getMakeModel());
        }
    }

    public static void searchByPrice(Vehicle[] vehicles)
    {
        // get user search criteria
        System.out.println();
        System.out.println("Search by Sell Price Range");
        System.out.println("-------------------");

        System.out.print("Enter min Price:");
        int min = Integer.parseInt(userInput.nextLine());
        System.out.println("Enter max Price");
        int max =Integer.parseInt(userInput.nextLine());

        // loop through vehicles and print only vehicles that match the search
        for(int i = 0; i < vehicles.length; i++ ) {
            Vehicle vehicle = vehicles[i];
            System.out.printf("%-20f",vehicle.getPrice());
        }
    }
    public static void searchByColor(Vehicle[] vehicles)
    {
        // get user search criteria
        System.out.println();
        System.out.println("Search by Color");
        System.out.println("-------------------");
        String searchPrice = userInput.nextLine();

        // loop through vehicles and print only vehicles that match the search
        for(int i = 0; i < vehicles.length; i++ ) {
            Vehicle vehicle = vehicles[i];
            System.out.printf("%-20s", vehicle.getColor());
        }
    }

    // bonus (optional)
    public static Vehicle[] addVehicle(Vehicle[] vehicles)
    {
        // get user input
        System.out.println("Add Vehicle info");
        System.out.println("-------------------");

        System.out.print("Vehicle ID: ");
        int vehicleId = userInput.nextInt();
        userInput.nextLine();

        System.out.print("Make and Model: ");
        String makeModel = userInput.nextLine();

        System.out.print("Car color: ");
        String color = userInput.nextLine();


        System.out.print("Odometer reading: ");
        int odometerReading = userInput.nextInt();
        userInput.nextLine();

        System.out.print("Price: ");
        double price = userInput.nextDouble();
        userInput.nextLine();

        // create a vehicle
        Vehicle  vehicle = new Vehicle(vehicleId,makeModel,color,odometerReading,price);

        Vehicle[] tempArray = new Vehicle[vehicles.length + 1];
        System.arraycopy(vehicles, 0, tempArray, 0, vehicles.length);
        tempArray[vehicles.length] = vehicle;
        vehicles = tempArray;


        System.out.println("Finished!!!");
        return vehicles;


        // add it to the inventor

        // hint: you will need to create a new array that is 1 bigger than the old one
        //       then add the new vehicle in the last spot
    }
}
