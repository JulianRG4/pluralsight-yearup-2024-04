package com.pluralsight;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {

        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);


        numbers.add(43);

        System.out.println("Numbers list size: " + numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());


        dates.add(LocalDate.of(2023, 5, 22));


        System.out.println("Dates list size: " + dates.getItems().size());
    }
}