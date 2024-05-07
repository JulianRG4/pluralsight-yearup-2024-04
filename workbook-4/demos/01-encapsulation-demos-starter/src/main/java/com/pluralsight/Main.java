package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person("John", "Doe", 25);
        System.out.println(person.getFirstName() + " " + person.getLastName());
        System.out.println(person.getFullName());

        //ask user for info
        Order donuts = new Order("Gregor", "Glazed", 4.50, 6 );
        System.out.println(donuts.getTotalPrice());
    }
}