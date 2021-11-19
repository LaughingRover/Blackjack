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

    /**
     * adds a new card to the players hand
     * @param card
     */
    public void setHand(Card card) {
        this.hand.add(card);
    }

    /**
     * @return the list of cards in the players hand
     */
    public Vector<Card> getHand() {
        return hand;
    }

    /**
     * Value holds the sum of the value of the players hand
     * @return value
     */
    public int getValueOfHand() {
        for(Card card : hand) value += card.getValue();
        return value;
    }

    /**
     * More card should return true if the player wants a hit
     * @return boolean
     */
    public Boolean moreCards() {
        /**
         * Todo: Write moreCards implementation
         */
        return false;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", hand=" + hand +
                ", value=" + getValueOfHand() +
                '}';
    }
}
