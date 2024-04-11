package com.pluralsight;

// ask user for their name
    // display the product and price
    // ask for quantity
    // ask for money
    // Give change back

public class GroceryStore
{
    public static void main(String[] args)
    {
        // declare variables
       final  String PRODUCT = "Milka Aplenmilch";
       final double PRICE = 2.99;

        //input values
        String customerName;
        int quantity;
        double totalPrice;

        // calculated
        double cashReceived;
        double changeReturned;


        // get user input
        customerName = "bob";
        quantity = 5;


        // calculations
        totalPrice = PRICE * quantity;
        cashReceived = 20;
        changeReturned = cashReceived;

        // display the receipt
        System.out.println();
        String message = String.format("Total: %.2f \n" , totalPrice);
        System.out.printf("Total: $ %10.3f " + totalPrice);
        System.out.println("Cash: " + cashReceived);
        System.out.println("Change: " + changeReturned);


    }




}
