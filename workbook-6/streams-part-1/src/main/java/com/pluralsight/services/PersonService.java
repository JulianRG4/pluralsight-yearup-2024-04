package com.pluralsight.services;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonService
{

    public List<Person> findPeople(List<Person> people, String name)
    {
        List<Person> nameSearched = new ArrayList<>();
        for (Person person : people)
        {
            if(person.getFirstName().equalsIgnoreCase(name))
            {
                nameSearched.add(person);
            }
        }

        return nameSearched;
    }

    public List<Person> findPeople(List<Person> people, int age)
    {
        List<Person> ageSearched = new ArrayList<>();
        for (Person person : people)
        {
            if (person.getAge() == age)
            {
                ageSearched.add(person);
            }
        }
        return ageSearched;
    }

    public int calculateAverageAge(List<Person> people)
    {
        int totalAge = 0;
        for (Person person : people)
        {
            totalAge += person.getAge();
        }

        return totalAge / people.size();
    }

    public int findOldestAge(List<Person> people)
    {
        int oldestAge = Integer.MIN_VALUE;
        for (Person person : people)
        {
            if (person.getAge() > oldestAge)
            {
                oldestAge = person.getAge();
            }
        }

        return oldestAge;
    }

    public int findYoungestAge(List<Person> people)
    {
        int youngestAge = Integer.MAX_VALUE;
        for (Person person : people)
        {
            if (person.getAge() < youngestAge)
            {
                youngestAge = person.getAge();
            }
        }
        return youngestAge;
    }

    public List<Person> sortYoungestFirst(List<Person> people)
    {
        List<Person> youngest = new ArrayList<>(people);
        Collections.sort(youngest);
        return youngest;
    }

    public List<Person> sortOldestFirst(List<Person> people)
    {
        List<Person> oldest = sortYoungestFirst(people);
        return oldest.reversed();
    }

    public List<Employee> createEmployees(List<Person> people)
    {
        List<Employee> employees = new ArrayList<>();

        for (Person person : people)
        {
            double salary = calculateSalary(person.getAge());
            Employee employee = new Employee(person.getFirstName(), person.getLastName(), person.getAge(), salary);
            employees.add(employee);
        }

        return employees;
    }
    private double calculateSalary(int age)
    {
        return age * 3000;
    }

}

