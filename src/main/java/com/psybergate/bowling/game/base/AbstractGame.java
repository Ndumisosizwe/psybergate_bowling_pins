package com.psybergate.bowling.game.base;

import com.psybergate.bowling.game.Frame;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractGame implements Game {

    private static final List<Frame> FRAMES = new ArrayList<>();
    static {
        for (int i = 0; i < 10; i++) {
            FRAMES.add(new Frame());
        }
    }

    private int score;

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int score() {
        return this.score;
    }

    @Override
    public int size() {
        return FRAMES.size();
    }

}
