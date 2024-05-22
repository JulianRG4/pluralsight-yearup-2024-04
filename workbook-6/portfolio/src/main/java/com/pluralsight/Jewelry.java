package com.pluralsight;

public class  Jewelry extends FixedAsset
{
    private double carat;

    public Jewelry(String name, double marketValue, double karat)
    {
        super(name, marketValue);
        this.carat = karat;
    }

    @Override
    public double getValue()
    {
        return carat;
    }


}
