package com.pluralsight;

import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        File file = new File("files/employees.csv");

        try(
                FileReader fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader);
        )
        {
            String  line =reader.readLine();

            while((line = reader.readLine()) != null)
            {
                String[] colums = line.split("[|]");

                int id = Integer.parseInt(colums[0]);
                String name = colums[1];
                double hoursWorked = Double.parseDouble(colums[2]);
                double payRate = Double.parseDouble(colums[3]);

                System.out.println(name + " Makes " + payRate + "per hour ");
            }
        }
        catch(IOException ex)
        {

        }
    }
}