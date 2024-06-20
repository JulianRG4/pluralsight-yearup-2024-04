package com.pluralsight.demo.services.Categories;

import com.pluralsight.demo.models.Category;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class MySqlCategoryDao implements CategoryDao
{
    private DataSource dataSource;

    @Autowired
    public MySqlCategoryDao(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    @Override
    public List<Category> getAll()
    {
        List<Category> categories = new ArrayList<>();

        try(Connection connection = dataSource.getConnection())
        {
            String sql = "SELECT CategoryID\n" +
                    "\t, CategoryName\n" +
                    "    , Description\n" +
                    "FROM categories;";

            Statement statement = connection.createStatement();
            ResultSet row = statement.executeQuery(sql);

            while (row.next())
            {
                int categoryId = row.getInt("CategoryID");
                String categoryName = row.getString("CategoryName");
                String description = row.getString("Description");

                categories.add(new Category(categoryId,categoryName,description));
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
        return categories;
    }

    @Override
    public Category getById(int id)
    {
        try(Connection connection = dataSource.getConnection())
        {
            String sql = "SELECT CategoryID\n" +
                    "\t, CategoryName\n" +
                    "    , Description\n" +
                    "FROM categories\n" +
                    "WHERE CategoryID = ?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);

            ResultSet row = statement.executeQuery();

            if (row.next())
            {
                return mapRowToCategories(row);
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public Category addCategory(Category category)
    {
        int newId = 0;
        try(Connection connection = dataSource.getConnection())
        {
            String sql = """
                    INSERT INTO categories ( CategoryName, Description)
                    VALUES (?, ?);
                    """;
            PreparedStatement statement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            statement.setString(1,category.getCategoryName());
            statement.setString(2,category.getDescription());

            statement.executeUpdate();
            ResultSet keys = statement.getGeneratedKeys();

            if (keys.next())
            {
                newId = keys.getInt("CategoryID");
            }

        }catch (Exception e)
        {
            System.out.println(e);
        }
        return getById(newId);
    }

    @Override
    public void updateCategory(int categoryId, Category category)
    {
        try(Connection connection = dataSource.getConnection())
        {
            String sql = """
                    UPDATE Categories
                    SET CategoryName = ?
                        , Description = ?
                    WHERE CategoryId = ?
                    """;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,category.getCategoryName());
            statement.setString(2, category.getDescription());
            statement.setInt(3, categoryId);

            statement.executeUpdate();
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
    }

    @Override
    public void deleteCategory(int categoryId)
    {
        try(Connection connection = dataSource.getConnection())
        {
            String sql = """
                    DELETE FROM Categories WHERE CategoryID = ?;
                    """;

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, categoryId);

            statement.executeUpdate();
        }
        catch (SQLException e)
        {
        }
    }


    public Category mapRowToCategories(ResultSet row) throws SQLException
    {
        int categoryId = row.getInt("CategoryID");
        String categoryName = row.getString("CategoryName");
        String description = row.getString("Description");

        return new Category(categoryId, categoryName, description);
    }
}
