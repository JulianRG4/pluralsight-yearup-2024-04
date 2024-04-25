package com.pluralsight;

public class Employee
{
    private String  iD;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(String iD, String name, double hoursWorked, double payRate)
    {
        this.iD = iD;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

    }

    public String  getiD()
    {
        return iD;
    }

    public void setiD(String iD)
    {
        this.iD = iD;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getHoursWorked()
    {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate()
    {
        return payRate;
    }

    public void setPayRate(double payRate)
    {
        this.payRate = payRate;
    }

    public double  getGrossPay()
    {
        return hoursWorked * payRate;
    }
}
