package com.pluralsight;

public class House
{
    private int yearBuilt;
    private String insideColor;
    private String outsideColor;


    public House(int yearBuilt, String insideColor, String outsideColor)
    {
        this.yearBuilt =yearBuilt;
        this.insideColor = insideColor;
        this.outsideColor = outsideColor;
    }
    public int getYearBuilt()
    {
        return yearBuilt;
    }

    public String getInsideColor()
    {
        return insideColor;
    }
    public String getOutsideColor()
    {
        return outsideColor;
    }
    public void paintOuside(String color)
    {
        outsideColor = color;
    }

}