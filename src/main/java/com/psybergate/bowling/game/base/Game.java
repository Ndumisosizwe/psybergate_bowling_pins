package com.psybergate.bowling.game.base;

/**
 * A typical game of a tenpin bowling game.
 */
public interface Game {

    /**
     * Called each time the player rolls a ball.
     *
     * @param pins the number of pins knocked down
     */
    void roll(int pins);

    /**
     * Called only at the very end of the game.
     *
     * @return The total score for that game.
     */
    int score();

}
