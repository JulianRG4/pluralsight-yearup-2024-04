package com.pluralsight;

import Models.Deck;
import Models.Hand;

import java.util.ArrayList;

public class BlackJack
{
    Deck deck = new Deck();
    ArrayList<Hand> players = new ArrayList<Hand>();

    public void run()
    {
        addPlayers();
        dealcards();
    }

    private void dealCards()
    {
        deck.shuffle();

        for ()
    }
}
