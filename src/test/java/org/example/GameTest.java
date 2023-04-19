package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    public void firstPlayerWins() {
        Game game = new Game();

        Player player1 = new Player(1, "Таня", 100);
        Player player2 = new Player(2, "Маша", 10);

        game.register(player1);
        game.register(player2);

        int expected = 1;
        int actual = game.round("Таня", "Маша");

        Assertions.assertEquals(expected,actual);

    }



    @Test
    public void secondPlayerWins() {
        Game game = new Game();

        Player player1 = new Player(1, "Таня", 10);
        Player player2 = new Player(2, "Маша", 100);

        game.register(player1);
        game.register(player2);

        int expected = 2;
        int actual = game.round("Таня", "Маша");

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void drawResult() {
        Game game = new Game();

        Player player1 = new Player(1, "Таня", 100);
        Player player2 = new Player(2, "Маша", 100);

        game.register(player1);
        game.register(player2);

        int expected = 0;
        int actual = game.round("Таня", "Маша");

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void firstPlayerNotRegistered() {
        Game game = new Game();

        Player player1 = new Player(1, "Таня", 10);
        Player player2 = new Player(2, "Маша", 100);

        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Олег","Маша");
        });

    }

    @Test
    public void secondPlayerNotRegistered() {
        Game game = new Game();

        Player player1 = new Player(1, "Таня", 100);
        Player player2 = new Player(2, "Маша", 10);

        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Таня","Олег");
        });

    }

    @Test
    public void bothPlayerNotRegistered() {
        Game game = new Game();

        Player player1 = new Player(1, "Маша", 10);
        Player player2 = new Player(2, "Таня", 100);

        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Паша","Олег");
        });

    }



}