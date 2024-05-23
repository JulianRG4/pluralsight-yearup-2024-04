package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T>
{
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize)
    {
        this.items = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void add(T item)
    {
        if (items.size() < maxSize)
        {
            items.add(item);
        } else
        {
            System.out.println("Sorry the list is full," + item + " was not added");
        }
    }

    public List<T> getItems()
    {
        return items;
    }
}