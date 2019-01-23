package com.psybergate.bowling.game.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ndumi
 * @since 23-Jan-19
 */
public class BowlingGame002Test extends BowlingGame001Test {

    @Test
    public void testGameShouldTakeSparesIntoAccount() {
        game.roll(4);
        game.roll(6);//spare

        game.roll(5);
        game.roll(2);

        //Total score at this point should be (6+4+5) for frame 1 (with bonus 5) plus (5+2) for second frame.
        assertEquals(22, game.score());

        game.roll(2);
        game.roll(5);
        assertEquals(29, game.score());
        game.roll(8);
        game.roll(2);//spare

        game.roll(1);
        game.roll(0);

        assertEquals(41, game.score());
    }
}