package com.company.game;

import com.company.deckOfCards.Card;

import java.util.Vector;

public class Hand {
    private  Vector<Card> hand = new Vector<>();
    private int value = 0;

    public Vector<Card> showHand(){
        return hand;
    }

    public void setHand(Vector<Card> hand) {
        this.hand = hand;
    }

    public int getValue() {
        for(Card card : hand) value += card.getValue();
        return value;
    }
}
