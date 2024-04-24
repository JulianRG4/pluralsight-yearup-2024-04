package com.pluralsight;

import javax.script.ScriptContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        while (true)
        {

        String filePath = promtUserForStory();

        if(filePath.equalsIgnoreCase("exit"))
        {
            return;
        }

        String story = readStory(filePath);

        System.out.println(story);
        }

    }

    public static String promtUserForStory()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println();
        System.out.println("Available Stories:");
        System.out.println("1) Goldilocks");
        System.out.println("2) Hansel and Gretle");
        System.out.println("3) Marry had a Little Lam");
        System.out.println("4) Exit");
        System.out.println("Enter a choise");

        int choise = userInput.nextInt();

        switch (choise)
        {
            case 1:
                return "File/goldiLocks.txt";
            case 2:
                return "file/hansel_and_gretel.txt";
            case 3:
                return "File/mary_had_a_little_lamb.txt";
            default:
                return "Exit";
        }
    }

    public static String readStory(String fileName)
    {
        File file = new File(fileName);

        //this lets you build the stream
        StringBuilder builder = new StringBuilder();

        try
        {
            //this converts the file into a stream
            FileInputStream fileStream = new FileInputStream(file);
            Scanner fileScanner = new Scanner(fileStream);

            while(fileScanner.hasNext())
            {
                String line = fileScanner.nextLine();

                //this line is what adds the lines to the builder
                builder.append(line + "\n");
            }

        }
        catch (FileNotFoundException ex)
        {

        }
        return builder.toString();


    }
}