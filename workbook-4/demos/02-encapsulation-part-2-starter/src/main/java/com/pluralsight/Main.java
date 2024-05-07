package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
      Car mustang = new Car("Ford", "Mustang");

      mustang.accelerate(100);
      while (mustang.getSpeed() < 100)
      {
          System.out.println(mustang.getSpeed());
          Thread.sleep(30);
      }
    }
}