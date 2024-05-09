package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest
{

    @Test
    public void checkIn_Should_MakeSureRoomIsNotOccupied_WhenCheckingIn()
    {
        Room room = new Room(1, 135, false, false);
        boolean initiallySetTo = true;
        boolean finallySetTo = true;

        room.checkIn();

        boolean actualSet = room.isOccupied();
        assertEquals(initiallySetTo, finallySetTo, "Because room starts at unoccupied and when checked in becomes occupied");
    }

    @Test
    public void checkOut_Should_MakeSureRoomIsOccupied_WhenCheckingOut()
    {
        Room room = new Room(1, 135, true,true);
        boolean initiallySetTo = false;
        boolean finallySetTo = false;

        room.checkOut();

        boolean actually = room.isOccupied();
        assertEquals(initiallySetTo, finallySetTo, "Because room starts at occupied and when checked out becomes unoccupied");
    }

    @Test
    public void cleanRoom_Should_CheckIfRoomIsDirty_WhenCleaningRoom()
    {
        Room room = new Room(1, 135, false,false);

        room.roomCleaners();

        assertFalse(room.isDirty());
    }

}