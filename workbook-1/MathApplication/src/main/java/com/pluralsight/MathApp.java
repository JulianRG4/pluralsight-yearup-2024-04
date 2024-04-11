package com.pluralsight;

public class MathApp
{
    public static void main(String[] args)
    {
        // find all 7 questions in your workbook on page 
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();

    }

    // write ONLY code for QUESTION 1 in this function
    public static void question1() {
        // Question 1:
        // declare variables here
        double bobSalary = 15.5;
        double garySalary = 20;
        double highestSalary;


        // code the logic to the problem here
        highestSalary = Math.max(bobSalary, garySalary);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Highest salary: " + highestSalary);

    }

    // write ONLY code for QUESTION 2 in this function
    public static void question2()
    {
        // Question 2:
        // declare variables here
        double carPrice = 5000.2;
        double truckPrice = 10000.5;
        double lowestPrice;

        // code the logic to the problem here
        lowestPrice = Math.min(carPrice, truckPrice);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Lowest Price out of Truck or Car; $" + lowestPrice);

    }


    // write ONLY code for QUESTION 3 in this function
    public static void question3()
    {
        // Question 3:
        // declare variables here
        double radius = 7.25;
        double area = Math.PI;


        // code the logic to the problem here
        area = Math.PI*(radius * radius);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Area = " + area);

    }


    // write ONLY code for QUESTION 4 in this function
    public static void question4()
    {
        // Question 4:
        // declare variables here
        double squareRoot;
        double variable = 5.0;



        // code the logic to the problem here
        squareRoot = Math.sqrt(variable);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Square Root of 5 = " + Math.sqrt(variable));

    }


    // write ONLY code for QUESTION 5 in this function
    public static void question5()
    {
        // Question 5:
        // declare variables here
        double firstPointX = 5;
        double firstPointY = 10;
        double secondPointX = 85;
        double secondPointY = 50;
        double height;
        double width;
        double distanceFromPoints;

        // code the logic to the problem here
        width = secondPointX - firstPointX;
        height = secondPointY - firstPointY;
        distanceFromPoints = Math.pow(width,2) + Math.pow(height,2);
        distanceFromPoints = Math.sqrt(distanceFromPoints);



        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Distances from First and Second Points = " +distanceFromPoints);

    }


    // write ONLY code for QUESTION 6 in this function
    public static void question6()
    {
        // Question 6:
        // declare variables here
        double setVariable = -3.8;
        double absolutePositiveValue;


        // code the logic to the problem here
        absolutePositiveValue = Math.abs(setVariable);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The Absolute Positive Value of " + setVariable + " is " + absolutePositiveValue);

    }


    // write ONLY code for QUESTION 7 in this function
    public static void question7()
    {
        // Question 7:
        // declare variables here

        float randomNumber;


        // code the logic to the problem here
        randomNumber = (float)Math.random();


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Random Number Between 1 and 0: " + randomNumber);

    }
}