package com.pluralsight;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Assets");
        ArrayList<Valuable> valuables = new ArrayList<>();

        valuables.add(new Gold("Gold Bar", 200, 8 ));
        valuables.add(new Jewelry("Ear Ring", 120, 3));
        valuables.add(new House("Home", 80, 2003, 13000, 2));



    }

}