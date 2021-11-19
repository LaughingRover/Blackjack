package com.company.game;

import com.company.deckOfCards.Card;

public class Player {
    private Hand hand;
    private Dealer dealer;

    public Card getCard() {
        return dealer.dealCard();
    }

    public void showHand() {
        hand.showHand();
    }

    public int getValueOfHand() {
        return hand.getValue();
    }

    public Boolean moreCards() {
       // Write moreCards implementation
        return false;
    }
}
