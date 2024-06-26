package com.pluralsight.demos;

import com.pluralsight.io.CityLoader;
import com.pluralsight.models.City;

import java.lang.foreign.ValueLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemos
{
    public static void main(String[] args)
    {
       // simpleMaps();
        displayCitiesPerCountry();
    }
    public static void simpleMaps()
    {
        HashMap<String, Integer> supplies = new HashMap<String, Integer>();

        supplies.put("Markers", 6);
        supplies.put("Scissors", 10);

        supplies.put("Markers", 12);

        System.out.println(supplies.get("Scissors"));
        System.out.println(supplies.getOrDefault("Crayons", 0));

        for (String key : supplies.keySet())
        {
            int value = supplies.get(key);
            System.out.println(key + ": " + value);
        }

       for(Map.Entry<String, Integer> row : supplies.entrySet())
       {
           System.out.println(row.getKey() + "--" + row.getValue());
       }
    }

    public static void displayCitiesPerCountry()
    {
        CityLoader loader = new CityLoader();
        ArrayList<City> cities = loader.loadCities();
        HashMap<String, Integer> countries = new HashMap<>();

        // populate the hashmap
        for (City city: cities)
        {
            String key = city.getCountry();
            if(countries.containsKey(key))
            {
                int count = countries.get(key) + 1;
                countries.put(key, count);
            }
            else
            {
                countries.put(key, 1);
            }
        }

        for(Map.Entry<String, Integer> row: countries.entrySet())
        {
            System.out.println(row.getKey() + " " + row.getValue());
        }
    }
}
