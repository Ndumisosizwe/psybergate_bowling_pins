package com.psybergate.bowling.game.impl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Ndumi
 * @since 24-Jan-19
 */
public class BowlingGame003Test extends BowlingGame002Test {

    @Test
    public void testGameShouldTakeStrikesIntoAccount() {
        game.roll(4);
        game.roll(5);

        game.roll(10);//strike (+6)

        game.roll(2);
        game.roll(4);

        assertEquals(31, game.score()); //running score at frame 3
    }
}