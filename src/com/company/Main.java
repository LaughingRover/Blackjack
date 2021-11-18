package com.company;

public class Main {

    public static void main(String[] args) {
	    Deck deck = new Deck();
        deck.completeDeck();
        deck.shuffleDeck();

        System.out.println(deck.getCardDeck());
        System.out.println(deck.getShuffledDeck());
    }
}
