package com.company;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Deck {

    private final Vector<Card> cardDeck = new Vector<>();
    private Vector<Card> shuffledDeck = new Vector<>();


    public Vector<Card> getCardDeck() {
        return cardDeck;
    }

    public void shuffleDeck() {
        shuffledDeck.addAll(cardDeck);
        Collections.shuffle(shuffledDeck);
    }

    public Vector<Card> getShuffledDeck() {
        return shuffledDeck;
    }

    public Card getNextCard() {
        return shuffledDeck.get(0);
    }

    public void createHearts() {
        final Vector<Card> hearts = new Vector<Card>(List.of(
                new Card("2", 2, "Hearts"),
                new Card("3", 3, "Hearts"),
                new Card("4", 4, "Hearts"),
                new Card("5", 5, "Hearts"),
                new Card("6", 6, "Hearts"),
                new Card("7", 7, "Hearts"),
                new Card("8", 8, "Hearts"),
                new Card("9", 9, "Hearts"),
                new Card("10", 10, "Hearts"),
                new Card("Jack", 10, "Hearts"),
                new Card("Queen", 10, "Hearts"),
                new Card("King", 10, "Hearts"),
                new Card("Ace", 11, "Hearts")
        ));

        cardDeck.addAll(hearts);
    }

    public void createSpades() {
        final Vector<Card> spades = new Vector<Card>(List.of(
                new Card("2", 2, "Spades"),
                new Card("3", 3, "Spades"),
                new Card("4", 4, "Spades"),
                new Card("5", 5, "Spades"),
                new Card("6", 6, "Spades"),
                new Card("7", 7, "Spades"),
                new Card("8", 8, "Spades"),
                new Card("9", 9, "Spades"),
                new Card("10", 10, "Spades"),
                new Card("Jack", 10, "Spades"),
                new Card("Queen", 10, "Spades"),
                new Card("King", 10, "Spades"),
                new Card("Ace", 11, "Spades")
        ));

        cardDeck.addAll(spades);
    }

    public void createClubs() {
        final Vector<Card> clubs = new Vector<Card>(List.of(
                new Card("2", 2, "Clubs"),
                new Card("3", 3, "Clubs"),
                new Card("4", 4, "Clubs"),
                new Card("5", 5, "Clubs"),
                new Card("6", 6, "Clubs"),
                new Card("7", 7, "Clubs"),
                new Card("8", 8, "Clubs"),
                new Card("9", 9, "Clubs"),
                new Card("10", 10, "Clubs"),
                new Card("Jack", 10, "Clubs"),
                new Card("Queen", 10, "Clubs"),
                new Card("King", 10, "Clubs"),
                new Card("Ace", 11, "Clubs")
        ));

        cardDeck.addAll(clubs);
    }

    public void createDiamonds() {
        final Vector<Card> diamonds = new Vector<Card>(List.of(
                new Card("2", 2, "Diamonds"),
                new Card("3", 3, "Diamonds"),
                new Card("4", 4, "Diamonds"),
                new Card("5", 5, "Diamonds"),
                new Card("6", 6, "Diamonds"),
                new Card("7", 7, "Diamonds"),
                new Card("8", 8, "Diamonds"),
                new Card("9", 9, "Diamonds"),
                new Card("10", 10, "Diamonds"),
                new Card("Jack", 10, "Diamonds"),
                new Card("Queen", 10, "Diamonds"),
                new Card("King", 10, "Diamonds"),
                new Card("Ace", 11, "Diamonds")
        ));

        cardDeck.addAll(diamonds);
    }

    public void completeDeck() {
        createHearts();
        createSpades();
        createClubs();
        createDiamonds();
    }
}
