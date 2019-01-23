package com.psybergate.bowling.game.base;

/**
 * A game of ten-pin bowling game.
 */
public interface Game {

    int NUMBER_OF_FRAMES = 10;
    int NUMBER_OF_PINS_PER_FRAME = 10;

    /**
     * Called each time the player rolls a ball.
     *
     * @param pins the number of pins knocked down
     */
    void roll(int pins);

    /**
     * Called only at the very end of the game.
     *
     * @return The total score for each game.
     */
    int score();

    /**
     * @return true if this game is over.
     */
    boolean isGameOver();
}
