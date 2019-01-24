package com.psybergate.bowling.game.impl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Ndumi
 * @since 24-Jan-19
 */
public class BowlingGame004Test extends BowlingGame003Test {

    @Test
    public void testGameShouldTakeIntoAccountRulesOfLastFrame() {
        game.roll(1);
        game.roll(4);

        game.roll(4);
        game.roll(5);

        game.roll(6);
        game.roll(4);//spare

        game.roll(5);
        game.roll(5);//spare

        game.roll(10);//strike

        game.roll(0);
        game.roll(1);

        game.roll(7);
        game.roll(3);//spare

        game.roll(6);
        game.roll(4);//spare

        game.roll(10);//strike

        //Last Frame
        game.roll(2);
        game.roll(8);//spare
        assertFalse("Game is not over yet, one more BONUS shot to go.", game.isGameOver());
        game.roll(6);
        assertTrue("Game should be over", game.isGameOver());
    }
}