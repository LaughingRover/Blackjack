package com.company;

import java.util.Collections;
import java.util.Vector;

public class Deck {
    private Vector<Card> cardDeck = new Vector<Card>();
    private Vector<Card> shuffledDeck = new Vector<Card>();

    public Vector<Card> shuffleDeck() {
        return shuffledDeck;
    }

    public Vector<Card> showShuffledDeck() {
        return shuffledDeck;
    }

    public Card getNextCard() {
        return shuffledDeck.get(0);
    }

    public void createHearts() {
        final Vector<String> hearts = new Vector<String>();
        hearts.add("2H");
        hearts.add("3H");
        hearts.add("4H");
        hearts.add("5H");
        hearts.add("6H");
        hearts.add("7H");
        hearts.add("8H");
        hearts.add("9H");
        hearts.add("10H");
        hearts.add("JH");
        hearts.add("QH");
        hearts.add("KH");
        hearts.add("AH");
    }

    public void createSpades() {
        final Vector<String> spades = new Vector<String>();
        spades.add("2S");
        spades.add("3S");
        spades.add("4S");
        spades.add("5S");
        spades.add("6S");
        spades.add("7S");
        spades.add("8S");
        spades.add("9S");
        spades.add("10S");
        spades.add("JS");
        spades.add("QS");
        spades.add("KS");
        spades.add("AS");
    }

    public void createClubs() {
        final Vector<String> clubs = new Vector<String>();
        clubs.add("2C");
        clubs.add("3C");
        clubs.add("4C");
        clubs.add("5C");
        clubs.add("6C");
        clubs.add("7C");
        clubs.add("8C");
        clubs.add("9C");
        clubs.add("10C");
        clubs.add("JC");
        clubs.add("QC");
        clubs.add("KC");
        clubs.add("AC");
    }

    public void createDiamonds() {
        final Vector<String> diamonds = new Vector<String>();
        diamonds.add("2D");
        diamonds.add("3D");
        diamonds.add("4D");
        diamonds.add("5D");
        diamonds.add("6D");
        diamonds.add("7D");
        diamonds.add("8D");
        diamonds.add("9D");
        diamonds.add("10D");
        diamonds.add("JD");
        diamonds.add("QD");
        diamonds.add("KD");
        diamonds.add("AD");
    }
}
