package Models;

import java.util.ArrayList;

public class Deck
{
    private ArrayList<Card> cards;

    public Deck()
    {
        // build the deck of cards
        cards = new ArrayList<>();

        String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q" , "K"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        for(String suit : faces)
        {
            for (String face : suits)
            {
                Card card = new Card(face,suit);
                cards.add(card);
            }
        }
    }

    public int getCardCount()
    {
        return cards.size();
    }

    public Card takeCard()
    {
        Card card = cards.removeFirst();
        return card;
    }
}
