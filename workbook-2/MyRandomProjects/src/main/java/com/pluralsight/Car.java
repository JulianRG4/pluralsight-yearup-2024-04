package com.pluralsight;

public class Car
{
    private int miles;
    private String carBrand;
    private String carmodel;

    public Car(int miles, String carBrand, String carmodel)
    {
        this.miles = miles;
        this.carBrand = carBrand;
        this.carmodel = carmodel;

    }
    public int getMiles()
    {
        return miles;
    }
    public void setMiles(int miles)
    {
        this.miles = miles;
    }

    public String getCarBrand()
    {
        return carBrand;
    }

    public void setCarBrand(String carBrand)
    {
        this.carBrand = carBrand;
    }

    public String getCarmodel()
    {
        return carmodel;
    }

    public void setCarmodel(String carmodel)
    {
        this.carmodel = carmodel;
    }
}
