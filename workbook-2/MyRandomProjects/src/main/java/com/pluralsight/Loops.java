package com.pluralsight;

public class Loops
{
    public class Program
    {
        public static void main(String args[])
        {
            int[] nums = {63, 65, 60, 53, 58, 37, 35, 31};
            displayNumbers(nums);
        }
        public static void displayNumbers(int[] nums)
        {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]+ " ");
            }
            System.out.println();
        }
    }

}
