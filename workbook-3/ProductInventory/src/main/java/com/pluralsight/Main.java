package com.pluralsight;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static Product[]
    private static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args)
    {
        loadProducts();

        System.out.println("there are " + products.size() + "products");

        for(int i = 0; i < products.size(); i++)
        {
            Product product = products.get(i);
            System.out.println(product);
        }




    }

    public static void loadProducts()
    {

        File file = new File("files/products.csv");

        try(Scanner fileScanner = new Scanner(file))
        {
            //skip the first line
            fileScanner.nextLine();

            wile(fileScanner.hasNext());
            {
                String line = fileScanner.nextLine();
                String [] collums = line.split("[|]");
                String sku = collums[0];
                String name = collums[1];
                double price = double.parseDouble collums[2];
                String department = collums[3];

                // Create
                Product product = new Product(sku, name, price, department);

                products.add(product);
            }
        }
        catch (IOException ex)
        {

        }

    }
}