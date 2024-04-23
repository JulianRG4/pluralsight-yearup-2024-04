package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       String filePath = "C:\\Pluralsight\\pluralsight-yearup-2024-04\\workbook-3\\data-files\\mary_had_a_little_lamb.txt";

        //1. need a file object that points to the text file
        File file = new File(filePath);

        //2. I need a file reader to open the file (Scanner)
        try(Scanner fileScanner = new Scanner(file))
        {
            //3. Read the Contents of the file
            while (fileScanner.hasNext())
            {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("That was a bad file name");
        }
        //fileScanner.close() has a;ready been called
    }

}