package com.company.game;

import com.company.deckOfCards.Card;
import com.company.deckOfCards.Deck;

public class Dealer {
    private Hand hand;
    private Deck deck;

    public Card dealCard() {
        return deck.getNextCard();
    }

    public void startNewGame(){
        deck.completeDeck();
        deck.shuffleDeck();
    }

    public void showHand(){}
}
