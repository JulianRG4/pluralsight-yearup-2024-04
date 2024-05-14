package com.pluralsight;

public class HoverCraft extends Vehicle
{
    private boolean canGoOnWater;

    public HoverCraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity,
                      boolean canGoOnWater)
    {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public boolean isCanGoOnWater() {
        return canGoOnWater;
    }

    public void setCanGoOnWater(boolean canGoOnWater) {
        this.canGoOnWater = canGoOnWater;
    }
}
