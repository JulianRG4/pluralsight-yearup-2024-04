package com.pluralsight;

import com.pluralsight.io.ProductLoader;
import com.pluralsight.models.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class HardwareStore
{
    private ProductLoader productLoader = new ProductLoader();
    private Scanner userInput = new Scanner(System.in);

    private ArrayList<Product> products;

    public HardwareStore()
    {
        products = productLoader.loadProducts();
    }


    public void run()
    {
        while (true)
        {
            int choise = displayHomeChoices();

            switch (choise)
            {
                case 1:
                    findProductById();
            }
        }
    }
    private void findProductById()
    {
        System.out.println();
        System.out.println("Find by ID");
        System.out.println("-".repeat(30));
        System.out.println("Enter product id");
        int productId = Integer.parseInt(userInput.nextLine().strip());

        Product product = null;

        for (Product currentProduct : products)
        {
            if(currentProduct.getId() == productId)
            {
                product = currentProduct;
                break;
            }
        }

        if(product != null)
        {
            System.out.println("Id " + productId);
            System.out.println("Category: " + product.getCategory());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: $ " + product.getPrice());
        }
        else
        {
            System.out.println("");
        }
    }

    public int displayHomeChoices()
    {
        System.out.println();
        System.out.println("Julian's Hardware store");
        System.out.println("------------------------");
        System.out.println("1) Find product by ID ");
        System.out.println("2) Search by category ");
        System.out.println("3) Exit");
    }
}
