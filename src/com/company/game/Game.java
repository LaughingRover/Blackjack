package com.company.game;

import com.company.deckOfCards.Deck;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Boolean session = false;
    private final List<Player> players = new ArrayList<>();
    Deck deck = new Deck();

    /**
     * Initial game setups
     */
    public void gameSetUp(){
        deck.completeDeck();
        deck.shuffleDeck();
        players.addAll(List.of(
                new Player(1L),
                new Player(2L),
                new Player(3L)
        ));
        dealCard();
    }

    /**
     * @return the list of players currently playing
     */
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * Loops through the list of players and set their hand with two cards to begin the game
     */
    public void dealCard() {
        players.forEach(p -> {
            p.setHand(deck.getNextCard());
            p.setHand(deck.getNextCard());
        });
    }

    /**
     * Takes a player and adds a card to the hand of the player
     */
    public void hit(Player player) {
        player.setHand(deck.getNextCard());
    }

    public int stick() {
        /**
         * Should I have a stick function?
         */
        return 0;
    }

    public void startNewGame() {
        session = true;
        gameSetUp();
        while (session){

            session = false;
        }
    }


}
