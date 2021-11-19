package com.company.deckOfCards;

import java.util.*;

public class Deck {

    private final Vector<Card> cardDeck = new Vector<>();
        private final Vector<Card> shuffledDeck = new Vector<>();

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
            Card nextCard = shuffledDeck.get(0);
            shuffledDeck.remove(0);
            return nextCard;
        }

        public int getDeckSize() {
            return shuffledDeck.size();
        }

        public void createHearts() {
            Suite hearts = new HeartsSuite("Hearts", "♥");
            cardDeck.addAll(hearts.getSuite());
        }

        public void createDiamonds() {
            Suite diamonds = new DiamondsSuite("Diamonds", "♦");
            cardDeck.addAll(diamonds.getSuite());
        }

        public void createClubs() {
            Suite clubs = new ClubsSuite("Clubs", "♣");
            cardDeck.addAll(clubs.getSuite());

        }

        public void createSpades() {
            Suite spades = new SpadesSuite("Spades", "♠");
            cardDeck.addAll(spades.getSuite());

        }

        public void completeDeck() {
            createHearts();
            createSpades();
            createClubs();
            createDiamonds();
        }
}
