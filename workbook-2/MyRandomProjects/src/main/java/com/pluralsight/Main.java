package com.pluralsight;

import java.util.Scanner;

public class Main
{   public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        Car car = buildCar();


    }
    public static Car buildCar()
    {
        System.out.println("enter your car miles");
        int miles = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Car Brand");
       String  brand = userInput.nextLine();

        System.out.println("Car Model");
       String  model = userInput.nextLine();

       Car car1 =new Car(miles,brand,model);

        return car1;
    }
}