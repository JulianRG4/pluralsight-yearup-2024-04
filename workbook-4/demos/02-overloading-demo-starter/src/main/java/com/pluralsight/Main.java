package com.pluralsight;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        GuestHistory history = new GuestHistory();

        ArrayList<Reservation> reservations = history.getAllReservations();

        for (Reservation reservation : reservations)
        {
            System.out.println(reservation.getRoom().getRoomNumber() + ": " + reservation.);
        }
    }
}