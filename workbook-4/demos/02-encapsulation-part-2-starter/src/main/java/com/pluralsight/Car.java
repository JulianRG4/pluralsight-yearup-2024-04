package com.pluralsight;

public class Car
{
    private String make;
    private String model;
    private int speed;

    public Car(String make, String model)
    {
        this.make = make;
        this.model = model;
        this.speed = 0;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void accelerate(int finalSpeed) throws InterruptedException
    {
        while (speed < finalSpeed)
        {
            speed += 1;
            System.out.println(speed);
            Thread.sleep(5);
        }
    }

    public void decelerate(int finalSpeed) throws InterruptedException
    {
        while (speed > finalSpeed)
        {
                speed -= 1;
                Thread.sleep(20);
        }
    }

    public void slamOnBrakes() throws InterruptedException
    {
        while (speed > 0)
        {
            speed -= 10;
            Thread.sleep(10);
        }
    }
}
