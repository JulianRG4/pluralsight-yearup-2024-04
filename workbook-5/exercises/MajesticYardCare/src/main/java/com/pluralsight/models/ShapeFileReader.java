
package com.pluralsight.models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShapeFileReader {

    public static List<Shape> readShapes()
    {
        List<Shape> shapes = new ArrayList<>();
        String filePath = "data/shapes.csv";  // Hardcoded file path

        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                String[] data = line.split("\\|");
                Shape shape = createShape(data);
                shapes.add(shape);
            }
        } catch (IOException exception)
        {
            exception.printStackTrace();
        }

        return shapes;
    }

    private static Shape createShape(String[] data)
    {
        String shapeType = data[0].toLowerCase();

        if (shapeType.equals("circle"))
        {
            return new Circle(Integer.parseInt(data[1]));
        }
        else if (shapeType.equals("rectangle"))
        {
            return new Rectangle(Integer.parseInt(data[1]), Integer.parseInt(data[2]));
        }
        else if (shapeType.equals("square"))
        {
            return new Square(Integer.parseInt(data[1]));
        }
        else if (shapeType.equals("triangle"))
        {
            return new Triangle(Integer.parseInt(data[1]), Integer.parseInt(data[2]));
        }
        else
        {
            throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        }
    }
}