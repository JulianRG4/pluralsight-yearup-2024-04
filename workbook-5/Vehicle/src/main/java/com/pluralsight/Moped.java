package com.pluralsight;

public class Moped extends Vehicle
{
    private boolean splitLane;
    private boolean hasHelmet;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity,
                 boolean splitLane, boolean hasHelmet)
    {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);

        this.splitLane = splitLane;
        this.hasHelmet = hasHelmet;
    }

    public boolean isSplitLane() {
        return splitLane;
    }

    public void setSplitLane(boolean splitLane) {
        this.splitLane = splitLane;
    }

    public boolean isHasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }
}
