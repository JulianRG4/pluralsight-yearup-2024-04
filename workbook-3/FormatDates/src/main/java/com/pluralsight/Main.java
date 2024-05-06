package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        numberedDateFormats();
        System.out.println();
        letterDateFormat();
        System.out.println();
        letterDateAndTimeFormat();

    }

    public static void numberedDateFormats() {
        System.out.println("Date");
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd / MM / yyyy");
        System.out.println(today.format(formatter));
        System.out.println();
        System.out.println(today);
    }

    public static void letterDateFormat() {
        System.out.println("Date");
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy ");
        System.out.println(today.format(formatter));
    }

    public static void letterDateAndTimeFormat()
    {
        System.out.println("Date");
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy h:mm");
        System.out.println(today.format(formatter));
lk

    }
}