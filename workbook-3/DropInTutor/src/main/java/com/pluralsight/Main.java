package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        int[] numbers1 = new int[10];
        numbers1[0] = 11;
        numbers1[1] = 22;
        numbers1[2] = 30;
        numbers1[3] = 40;
        numbers1[4] = 55;
//        numbers1[5] = ;
//        numbers1[6] = ;
//        numbers1[7] = ;
//        numbers1[8] = ;

        int[] numbers2 = {6,7,9,3,5,5,8,7,1,2};

        for(int i = 0; i < numbers1.length; i++)
        {
            if(numbers1[i] %2 == 0 )
            {
                numbers1[i] = 100;
            }
            else
            {
                numbers1[i] = 001;
            }
        }

        for(int i =0; i < numbers1.length; i++)
        {
           System.out.println(numbers1[i]);
            System.out.println(i);
        }




    }
}