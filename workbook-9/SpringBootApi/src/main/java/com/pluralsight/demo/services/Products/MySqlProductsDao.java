package com.pluralsight.demo.services.Products;

import com.pluralsight.demo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class MySqlProductsDao implements ProductsDao
{
    private DataSource dataSource;

    @Autowired
    public MySqlProductsDao(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    @Override
    public List<Product> getAll()
    {
        List<Product> products = new ArrayList<>();

        try(Connection connection = dataSource.getConnection())
        {
            String sql = "SELECT ProductID\n" +
                    "\t, ProductName\n" +
                    "    , CategoryID\n" +
                    "    , UnitPrice\n" +
                    "FROM products;";

            Statement statement = connection.createStatement();
            ResultSet row = statement.executeQuery(sql);

            while (row.next())
            {
                int productId = row.getInt("ProductID");
                String productName = row.getString("ProductName");
                int categoryId = row.getInt("CategoryID");
                double unitPrice = row.getDouble("UnitPrice");

                products.add(new Product(productId,productName,categoryId,unitPrice));
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
        return  products;
    }

    @Override
    public Product getById(int id)
    {
        try(Connection connection = dataSource.getConnection())
        {
            String sql = "SELECT ProductID\n" +
                    "\t, ProductName\n" +
                    "    , CategoryID\n" +
                    "    , UnitPrice\n" +
                    "FROM products\n" +
                    "WHERE ProductID = ?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);

            ResultSet row = statement.executeQuery();

            if(row.next())
            {
                return mapRowToProducts(row);
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
        return null;
    }

    public Product mapRowToProducts(ResultSet row) throws SQLException
    {
        int productId = row.getInt("ProductID");
        String productName = row.getString("ProductName");
        int categoryId = row.getInt("CategoryId");
        double unitPrice = row.getInt("UnitPrice");

        return new Product(productId,productName,categoryId,unitPrice);
    }


}
