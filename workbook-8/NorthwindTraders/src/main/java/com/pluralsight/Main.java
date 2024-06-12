package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welcome");
        try
        {
            homeScreen();
        }
        catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void homeScreen () throws ClassNotFoundException
    {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0)
        {
            System.out.println();
            System.out.println("[1] Display All Products");
            System.out.println("[2] Display All Customers");
            System.out.println("[3] Display All Categories");
            System.out.println("[0] Exit");

            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    searchAllProducts();
                    break;
                case 2:
                    displayAllCustomers();
                    break;
                case 3:
                    categories();
                    searchAllProducts();
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
            }
        }
    }

    public static void searchAllProducts ()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter category ID");
        int categoryId = scanner.nextInt();

        String username = "root";
        String password = "YUm15510n";

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    username,
                    password);

            String sql = """
                        SELECT * 
                        FROM products
                        WHERE CategoryID = ?;
                        """;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,categoryId);
            ResultSet resultSet = statement.executeQuery();

            System.out.println("Product ID        Product Name                    Unit Price           Units In Stock");

            while (resultSet.next())
            {
                int ProductID = resultSet.getInt("ProductID");
                String ProductName = resultSet.getString("ProductName");
                int UnitPrice = resultSet.getInt("UnitPrice");
                int UnitsInStock = resultSet.getInt("UnitsInStock");

                System.out.printf("%-20d %-35s %-15d %-10d \n", ProductID, ProductName, UnitPrice, UnitsInStock);
            }
            connection.close();
        }
        catch (Exception e)
        {L
            System.out.println(e);
        }
    }

    public static void displayAllCustomers() throws ClassNotFoundException {
        String username = "root";
        String password = "YUm15510n";

        Class.forName("com.mysql.cj.jdbc.Driver");

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", username, password))
        {
            String sql = "SELECT ContactName\n" +
                    "\t, CompanyName\n" +
                    "    , City\n" +
                    "    , Country\n" +
                    "\t, Phone\n" +
                    "FROM customers\n" +
                    "ORDER BY Country;";

            Statement statement = connection.createStatement();
            ResultSet row = statement.executeQuery(sql);

            System.out.println("Contact Name          Company Name                                 City                                    Country                                    Phone ");

            while (row.next())
            {
                String contactName = row.getString("ContactName");
                String companyName = row.getString("CompanyName");
                String city = row.getString("City");
                String country = row.getString("Country");
                String phone = row.getString("Phone");

                System.out.printf("%-25s %-40s %-40s %-40s %-40s\n", contactName, companyName, city, country, phone);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void categories()
    {
        String username = "root";
        String password = "YUm15510n";

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", username, password))
        {
            String sql = "SELECT CategoryID\n" +
                    "\t,CategoryName\n" +
                    "FROM categories\n" +
                    "ORDER BY CategoryID;";

            Statement statement = connection.createStatement();
            ResultSet row = statement.executeQuery(sql);

            System.out.println("Category ID         Category Name");

            while (row.next())
            {
                int categoryId = row.getInt("CategoryID");
                String categoryName = row.getString("CategoryName");

                System.out.printf("%-20d %s\n", categoryId, categoryName);
            }
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
    }
}