package com.company.game;

import com.company.deckOfCards.Card;

import java.util.Vector;

public class Player {

    private Long id;
    private Vector<Card> hand = new Vector<>();
    private int value = 0;

    public Player(Long id) {
        this.id = id;
    }


    public void setHand(Card card) {
        this.hand.add(card);
    }

    public Vector<Card> getHand() {
        return hand;
    }

    public int getValueOfHand() {
        for(Card card : hand) value += card.getValue();
        return value;
    }

    public Boolean moreCards() {
        /**
         * Todo: Write moreCards implementation
         */
        return false;
    }
}
