package com.pluralsight;

import java.util.Arrays;
public class Main
{
    public static void main(String args[])
    {
        String[] colors = {"red", "white", "blue"};
        String[] colorCopy = new String[3];
        // copy from colors at subscript 1 to
        // colorCopy at 0 -- move 2 elements
        System.arraycopy(colors, 1, colorCopy, 0, 2);
        for (int i = 0; i < 2; i++) {
            System.out.println(colorCopy[i]);
        }
    }
}