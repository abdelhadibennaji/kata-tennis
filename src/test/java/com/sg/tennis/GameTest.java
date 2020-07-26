package com.sg.tennis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    public void The_game_should_starts_with_a_score_of_0_point_for_each_player() {
        // GIVEN
        Player firstPlayer = new Player("Nadal");
        Player secondPlayer = new Player("Jeko");
        // WHEN
        Game game = Game.start(firstPlayer, secondPlayer);
        // THEN
        assertEquals(Score.ZERO, game.getScoreFirstPlayer());
        assertEquals(Score.ZERO, game.getScoreSecondPlayer());
    }
}
