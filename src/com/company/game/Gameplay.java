package com.company.game;

import com.company.deckOfCards.Deck;

public class Gameplay {
    private Boolean session = false;

    Deck deck;
    Player player1 = new Player();
    Player player2 = new Player();
    Player player3 = new Player();

    public void gameSetUp(){
        deck.completeDeck();
        deck.shuffleDeck();
    }

    public void startNewGame() {
        session = true;
        gameSetUp();
        while (session){
        }
    }


}
