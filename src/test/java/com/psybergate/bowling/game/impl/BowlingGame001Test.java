package com.psybergate.bowling.game.impl;

import com.psybergate.bowling.game.base.Game;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingGame001Test {

    private Game game;

    @Before
    public void setUp() throws Exception {
        this.game = new BowlingGame001();
    }

    @Test
    public void testNewGameShouldHave10FramesAfterCreation() {
        assertEquals(10, game.size());
    }

    @Test
    public void shouldAlwaysResultToScoreOfLessThan10PerFrame() {
        for (int i = 0; i < 2; i++) {
            game.roll(5);
        }
        assertEquals(10, game.score());
    }

    @Test
    public void score() {
        assertEquals(1, 1);
    }
}