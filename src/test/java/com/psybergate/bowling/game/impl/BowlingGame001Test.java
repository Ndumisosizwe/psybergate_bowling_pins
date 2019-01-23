package com.psybergate.bowling.game.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.psybergate.bowling.game.base.Game;

public class BowlingGame001Test {

    private Game game;

    @Before
    public void setUp() {
        this.game = new BowlingGame001();
    }

    @Test
    public void testGameShouldIgnoreIncorrectNumberOfPins() {
        int numberOfPinsKnockedDownOnFirstRoll = 4;
        game.roll(numberOfPinsKnockedDownOnFirstRoll);
        game.roll(8); // should be ignored, since greater than remaining pins standing.
        game.roll(4);
        assertEquals(8, game.score());
    }


    @Test
    public void testGameShouldReturnCorrectGameScoreAtAnyPoint() {
        game.roll(8);
        game.roll(4); //should be ignored
        game.roll(2); //at this point, you should still be on frame 1.
        game.roll(2); //now on frame 2.

        //score at this point should be 8 + 2 = 10, frame 2 not complete yet.
        assertEquals(10, game.score());
        game.roll(5); //score should now be 10 + (5 + 2) since second frame is now complete.
        assertEquals(17, game.score());
    }

    @Test
    public void testGameShouldDisregardRollsWithNegativeNumbers() {
        game.roll(-8);
        game.roll(-3);
        game.roll(4); //Game only starts here
        game.roll(0); //At this point, you should still be on frame 1.
        //score at this point should be (4 + 0)
        assertEquals(4, game.score());
    }

    @Test
    public void testGameShouldJumpToNextFrameIfScoreOf10IsHitFirstTime() {
        game.roll(10); //since got 10 first time, next roll will be on frame 2.
        assertEquals(10, game.score());
        game.roll(0);
        game.roll(6);
        assertEquals(16, game.score());
    }

    @Test
    public void testGameShouldNotRollOnceGameIsOver() {
        for (int i = 0; i < Game.NUMBER_OF_PINS_PER_FRAME; i++) {
            game.roll(10);
        }
        //The game is over
        assertTrue(this.game.isGameOver());
        assertEquals(10 * 10, game.score());
        game.roll(2);
        game.roll(-2);
        game.roll(5);
        game.roll(3);
        //game score should still be the same effectively.
        assertEquals(10 * 10, game.score());
    }


}