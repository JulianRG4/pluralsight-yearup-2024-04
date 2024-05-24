package com.pluralsight.services;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {

    public List<Person> findPeople(List<Person> people, String name) {
        return people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(name))
                .collect(Collectors.toList());

    }

    public List<Person> findPeople(List<Person> people, int age) {
        //using both ways to see difference with using List<Person> and return people.
        List<Person> findByAge = people.stream()
                .filter(person -> person.getAge() == age)
                .toList();
        return findByAge;
    }

    public int calculateAverageAge(List<Person> people) {
        int totalAge = people.stream()
                .mapToInt(person -> person.getAge())
                .sum();

        return totalAge / people.size();
    }

    public int findOldestAge(List<Person> people) {

        return people.stream()
                .mapToInt(Person::getAge)
                .max()
                .getAsInt();
    }

    public int findYoungestAge(List<Person> people) {

        return people.stream()
                .mapToInt(Person::getAge)
                .min()
                .getAsInt();
    }

    public List<Person> sortYoungestFirst(List<Person> people) {
        return people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());
    }


    public List<Person> sortOldestFirst(List<Person> people) {
        return people.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .collect(Collectors.toList());
    }

    public List<Employee> createEmployees(List<Person> people)
    {
        List<Employee> employees = people.stream()
                .map(person -> {
                    return new Employee(person.getFirstName(), person.getLastName(), person.getAge(), person.getAge() * 3000);
                })
                .toList();
        return employees;
    }
}
