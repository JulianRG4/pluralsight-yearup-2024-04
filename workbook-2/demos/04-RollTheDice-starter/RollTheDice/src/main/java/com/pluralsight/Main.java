package com.pluralsight;

public class Main {
    public static void main(String[] args)
    {

        Dice dice = new Dice();


        int dice1;
        int dice2;
        int sum;

        int twoCounter = 0;
        int forCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for(int i = 0; i < 20; i++)
        {
            dice1 = dice.roll();
            dice2 = dice.roll();
            sum = dice1 + dice2;

            System.out.printf("Roll %d: %d - %d sum: %d\n", i, dice1, dice2, sum);

            if(sum ==2)twoCounter++;
            else if (sum == 4) forCounter++;
            else if (sum == 6) sixCounter++;
            else if (sum == 7) sevenCounter++;

        }
        System.out.println("----------------------");
        System.out.printf("Count 2: %d\n", twoCounter);
        System.out.printf("Count 4: %d\n", forCounter);
        System.out.printf("Count 6: %d\n", sixCounter);
        System.out.printf("Count 7: %d\n", sevenCounter);


        }

    }

}