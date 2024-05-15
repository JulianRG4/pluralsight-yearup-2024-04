package com.pluralsight;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Asset> assets = new ArrayList<>();


        assets.add(new House("My House", "2010-06-15", 300000, "123 Main St", 1, 2500, 5000));
        assets.add(new House("Vacation Home", "2015-08-23", 200000, "456 Beach Dr", 2, 1800, 3000));

        assets.add(new Vehicle("Tom's Truck", "2002-03-05", 25000, "Ford F-150", 2012, 120000));
        assets.add(new Vehicle("My Car", "2018-03-10", 30000, "Dodge Charger", 2014, 50000));


        for (Asset asset : assets)
        {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: " + asset.getOriginalCost());
            System.out.println("Current Value: " + asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
                System.out.println("Size: " + house.getSize() + " sq ft");
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Make/Model: " + vehicle.getMakeModel());
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Odometer: " + vehicle.getOdometer());
            }
            System.out.println();
        }
    }
}