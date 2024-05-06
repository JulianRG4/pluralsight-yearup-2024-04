package com.pluralsight;

import java.io.*;

public class PrintWriterDemo
{
    public static void main(String[] args)
    {
        String[] languages = {"Java", "C#", "JavaScript", "Python", "SQL"};
        writeToFile(languages);
    }

    public static void writeToFile(String[] words)
    {
        File file = new File("files/programming-languages-print-writer.txt");

        // New FileWriter(file) -> create new file and overwrites the existing one
        // new FileWriter(file, true) -> opens the existing file for appending
        try(FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter writer = new PrintWriter(fileWriter);
        )
        {
            for(String line : words)
            {
                // works like System.out.print()
                writer.println(line);
            }
        }
        catch(IOException ex)
        {

        }
    }
}
