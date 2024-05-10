package Models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HandTest
{
    @Test
    public void deal_should_increaseCardCount()
    {
        //arrange
        Hand hand = new Hand("Hassan");
        Card card = new Card("Diamonds", "9");
        Card card2 = new Card("Spades", "4");

        //act
        hand.deal(card);

        //assert
        int expectedCardCount = 2;
        int cardCount = hand.getCardCount();
        assertEquals(expectedCardCount, cardCount, "Because we delt 2 cards");

        ArrayList<Card> cards = hand.getCards();
        assertTrue(cards.contains(card), "Because the 9 of Diamonds should be in the list of cards");
        assertTrue(cards.contains(card2) ,h);
    }

}