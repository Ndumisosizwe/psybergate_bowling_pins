package com.psybergate.bowling.game.base;

import com.psybergate.bowling.game.Frame;

import java.util.ArrayList;
import java.util.List;

public abstract class TenPinBowlingGame implements Game {

    private final List<Frame> FRAMES = new ArrayList<>();
    protected FrameIndexViewModel frameViewModel;

    {
        for (int i = 0; i < NUMBER_OF_FRAMES; i++) {
            FRAMES.add(new Frame());
        }
        frameViewModel = new FrameIndexViewModel(FRAMES.get(0), 0);
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

    protected void updateCurrentFrameAndMoveToNextOne(Frame frame, int indexOfCurrentFrame, Integer roll) {
        frame.setFull(true);
        frame.setScore(roll + frame.getRolls()[1]);
        this.setScore(this.score() + frame.getScore());
        if ((indexOfCurrentFrame + 1) < FRAMES.size()) {
            this.frameViewModel = new TenPinBowlingGame.FrameIndexViewModel(FRAMES.get(indexOfCurrentFrame + 1), indexOfCurrentFrame + 1);
        } else {
            this.setGameOver(true);
        }
    }

    protected final class FrameIndexViewModel {
        public final Frame frame;
        public final int indexOfCurrentFrame;

        private FrameIndexViewModel(Frame frame, int indexOfFrame) {
            super();
            this.frame = frame;
            this.indexOfCurrentFrame = indexOfFrame;
        }
    }
}
