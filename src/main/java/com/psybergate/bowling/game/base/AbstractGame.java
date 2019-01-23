package com.psybergate.bowling.game.base;

import com.psybergate.bowling.game.Frame;

public abstract class AbstractGame implements Game {

    private static final Frame[] FRAMES = new Frame[10];

    static {
        for (int i = 0; i < FRAMES.length; i++)
            FRAMES[i] = new Frame();
    }

    protected int totalScore;

    public int score() {
        return this.totalScore;
    }

}
