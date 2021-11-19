package com.company;

import com.company.game.Game;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.gameSetUp();
        System.out.println(game.getPlayers());
    }
}
