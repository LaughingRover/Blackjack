package com.company;

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
        return value;
    }
}
