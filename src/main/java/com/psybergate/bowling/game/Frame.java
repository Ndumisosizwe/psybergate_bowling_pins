package com.psybergate.bowling.game;

import java.util.Arrays;

/**
 * Encapsulates a <code>Frame</code> for a ten-pin bowling game.
 *
 * @see Frame
 */
public class Frame {

    private int score;
    private final Integer[] rolls = new Integer[2];
    private boolean isFull;
    private boolean hasSpareBonus;
    private boolean hasStrikeBonus;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isFull() {
        return isFull;
    }

    public boolean isHasSpareBonus() {
        return hasSpareBonus;
    }

    public void setHasSpareBonus(boolean hasSpareBonus) {
        this.hasSpareBonus = hasSpareBonus;
    }

    public boolean isHasStrikeBonus() {
        return hasStrikeBonus;
    }

    public void setHasStrikeBonus(boolean hasStrikeBonus) {
        this.hasStrikeBonus = hasStrikeBonus;
    }

    public void setFull(boolean isFull) {
        this.isFull = isFull;
    }

    public Integer[] getRolls() {
        return rolls;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "score=" + score +
                ", rolls=" + Arrays.toString(rolls) +
                ", isFull=" + isFull +
                '}';
    }
}
