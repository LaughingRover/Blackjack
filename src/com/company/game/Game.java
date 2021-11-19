package com.company.game;

import com.company.deckOfCards.Card;
import com.company.deckOfCards.Deck;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Boolean session = false;
    private final List<Player> players;
    Deck deck = new Deck();

    public Game(List<Player> players) {
        this.players = players;
    }

    public void gameSetUp(){
        deck.completeDeck();
        deck.shuffleDeck();
        List.of(
                new Player(1L),
                new Player(2L),
                new Player(3L)
        ).add((Player) players);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void dealCard() {
        /**
         * Todo: Loops through the list of players and set their hand with two cards
         */
    }

    public void hit(Player player) {
        /**
         * Todo: Takes a player and adds a card to the hand of the player
         */
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
