package Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest
{

    @Test
    public void getColor_ShouldReturnRed_ForHearts()
    {
        //arrange
        Card card =new Card("Hearts" , "Q");

        //act
        String color = card.getColor();

        //assert
        String expectedColor = "Red";
        assertEquals(expectedColor, color, "Because the card is a Queen of Hearts");
    }

    @Test
    public void getPoint_ShouldReturn10_ForQueen()
    {
        //arrange
        Card card = new Card("Hearts", "Q");

        //act
      int pointValue = card.geyPointValue();

        //assert
        int expectedPointValue = 10;
        assertEquals(expectedPointValue, pointValue, "Because the card is a Queen of Hearts");
    }

}