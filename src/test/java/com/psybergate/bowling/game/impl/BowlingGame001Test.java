package com.psybergate.bowling.game.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.psybergate.bowling.game.base.Game;

public class BowlingGame001Test {

	private Game game;

	@Before
	public void setUp() throws Exception {
		this.game = new BowlingGame001();
	}

	@Test
	public void testShouldKeepTrackOfCorrectNumberOfPins() {
		int numberOfPinsKnockedDownOnFirstRoll = 4;
		game.roll(numberOfPinsKnockedDownOnFirstRoll);
		game.roll(8);// should be ignored, since greater than remaining pins.
		game.roll(2);
		assertEquals(6, game.score());
	}
}