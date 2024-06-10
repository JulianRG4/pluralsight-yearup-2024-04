package com.pluralsight;

import java.sql.*;

public class Main
{
    public static void main(String[] args)
    {
       String username = "root";
       String password = "YUm15510n";

        try
        {
            Class.forName("com.mysql.cl.jdbc.Driver");

            Connection connection = null;
            Connection Connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    username,
                    password);

            String sql = """
                    SELECT * 
                    FROM products;
                    """;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next())
            {
                int ProductID = resultSet.getInt("ProductID");
                String ProductName = resultSet.getString("ProductName");
                int SupplierID = resultSet.getInt("SupplierID");
                int CategoryID = resultSet.getInt("CategoryID");
                String QuantityPerUnit = resultSet.getString("QuantityPerUnit");
                int UnitPrice = resultSet.getInt("UnitPrice");
                int UnitsInStock = resultSet.getInt("UnitsInStock");
                int UnitsOnOrder = resultSet.getInt("UnitsOnOrder");
                int ReorderLevel = resultSet.getInt("ReorderLevel");
                int Discontinued = resultSet.getInt("Discontinued");

                System.out.printf("%-10d %-10s %-10d %-10d %-10s %-10d %-10d %-10d %-10d %-10d", ProductID, ProductName, SupplierID, CategoryID,QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued);
            }

            connection.close();

        } 
        catch (Exception e)
        {
            System.out.println(e);
        } 

    }

    
}