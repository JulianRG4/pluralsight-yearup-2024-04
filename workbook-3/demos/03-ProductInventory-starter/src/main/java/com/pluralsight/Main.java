package com.pluralsight;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

   private static ArrayList<Product> products = new ArrayList<>();
   // private static Product[] products = new Product[12];

    public static void main(String[] args)
    {

//        Product airPods = new Product("sku123", "Air pod 3", 149.99, "Electronic");
//        printProduct(airPods);

        //get all products form the csv
        loadProducts();

        displayAllProducts();


    }

    public static void loadProducts() {
        // 1. create a file with the path to the actual file
        File file = new File("files/products.csv");

        // 2. open the file using a Scanner
        try (Scanner fileScanner = new Scanner(file)) {
            // skip the first line - because it is a header line
            fileScanner.nextLine();
//            int i = 0;
            // 3. loop through each line in the file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                // split the line on a | (pipe)
                String[] columns = line.split("[|]");

                // get the specific variables
                String sku = columns[0];
                String name = columns[1];
                double price = Double.parseDouble(columns[2]);
                String department = columns[3];

                // create a new product from the current line
                Product product = new Product(sku, name, price, department);

                // add the new product to the products ArrayList
                products.add(product);

                // add each product to my array list
//                products[i] = product;
//                i++;

            }

        } catch (IOException ex)
        {
            //this catches only FileNotFound exceptions
        }
        catch (Exception ex)
        {
            //catches generic exceptions
        }
    }

    public static void displayAllProducts()
    {
        System.out.println();
        System.out.println("All Products");
        System.out.println("-".repeat(70));

//        for(int i = 0; i < products.length; i++)
//        {
//            Product product =products[i];
//            printProduct(product);
//        }

        // foreach loop - used through anything you can iterate through
        // creates a product variable and then assigns it to products
        for(Product product : products)
        {
            printProduct(product);
        }
    }

    public static void printProduct(Product product)
    {
        System.out.printf("%-10s %-30s $%6.2f %s\n", product.getSku(), product.getName(), product.getPrice(), product.getDepartment());
    }
}