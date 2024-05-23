package com.pluralsight.services;

import com.pluralsight.models.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest
{
    @Test
    public void findPeople_Should_FindPeople_BasedOnName()
    {
        //assert
        Person person = new Person("Julian", "Gonzalez", 22);
        String expectedName = "Julian";

    }

}