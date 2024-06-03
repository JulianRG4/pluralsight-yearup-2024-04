package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Portfolio
{
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner)
    {
        this.name = name;
        this.owner = owner;
        assets = new ArrayList<>();
    }

    public void add(Valuable valuable)
    {
        assets.add(valuable);
    }


    public double getValue()
    {
        return 0;
    }

    public Valuable getMostValuable()
    {
        return null;
    }

    public Valuable getLeastValuable()
    {
        return null;
    }

}