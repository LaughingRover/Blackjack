package com.company.test;

import com.company.Deck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void assertThatCompleteDeckContains52Cards() {
        Deck deck = new Deck();
        deck.completeDeck();
        int expected = 52;
        int actual = deck.getCardDeck().size();

        assertEquals(expected, actual);
    }

    @Test
    void assertThatShuffledDeckIsNotEmpty() {
        Deck deck = new Deck();
        deck.completeDeck();
        deck.shuffleDeck();
        int expected = 52;
        int actual = deck.getShuffledDeck().size();

        assertEquals(expected, actual);
    }

    @Test
    void assertThatDeckIsShuffled() {
        Deck deck = new Deck();
        deck.completeDeck();
        deck.shuffleDeck();
        boolean actual = !(deck.getShuffledDeck().equals(deck.getCardDeck()));

        assertTrue(actual);
    }
}