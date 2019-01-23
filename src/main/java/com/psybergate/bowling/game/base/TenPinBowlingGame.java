package com.psybergate.bowling.game.base;

import com.psybergate.bowling.game.Frame;

import java.util.ArrayList;
import java.util.List;

public abstract class TenPinBowlingGame implements Game {

    protected final List<Frame> FRAMES = new ArrayList<>();

    {
        for (int i = 0; i < NUMBER_OF_FRAMES; i++) {
            FRAMES.add(new Frame());
        }
    }

    private int score;
    private boolean isGameOver;

    protected void setScore(int score) {
        this.score = score;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    protected void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    @Override
    public int score() {
        return this.score;
    }
}
