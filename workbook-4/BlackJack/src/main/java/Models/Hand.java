package Models;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private String playerName;

    public Hand(String playerName) {
        this.playerName = playerName;
        cards = new ArrayList<>();
    }

    public String grtPlayerName() {
        return playerName;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getCardCount() {
        return cards.size();
    }

    public int getPointValue() {
        // return sum of all card points
        int sum = 0;

        for (Card card : cards) {
            sum += card.geyPointValue();
        }
    }

    public void deal(Card card)
    {

    }
}
