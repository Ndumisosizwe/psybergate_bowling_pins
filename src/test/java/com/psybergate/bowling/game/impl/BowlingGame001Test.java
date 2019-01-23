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
    public void testNewGameShouldHave10FramesAfterCreation(){
    }

    @Test
    public void shouldAlwaysResultToScoreOfLessThan10() {
        this.game.roll(5);
        this.game.roll(5);
        assertTrue(game.score() < 10);
    }

    @Test
    public void score() {
        assertEquals(1, 1);
    }
}