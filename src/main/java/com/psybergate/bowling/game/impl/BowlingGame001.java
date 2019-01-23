package com.psybergate.bowling.game.impl;

import com.psybergate.bowling.game.Frame;
import com.psybergate.bowling.game.base.TenPinBowlingGame;

/**
 * Implementation 001. Should be capable of all the basics of the game. No
 * spares, no strikes.
 *
 * @author ndumiso.mhlongo
 */
public class BowlingGame001 extends TenPinBowlingGame {

    private FrameIndexViewModel frameViewModel = new FrameIndexViewModel(FRAMES.get(0), 0);

    public void roll(int pins) {
        if (pins < 0) return;
        Frame frame = frameViewModel.frame;
        int indexOfCurrentFrame = this.frameViewModel.indexOfCurrentFrame;
        Integer frameFirstRoll = frame.getRolls()[0];
        if (frameFirstRoll == null) {
            frame.getRolls()[0] = pins;
            if (pins == NUMBER_OF_PINS_PER_FRAME) {
                frame.getRolls()[1] = 0;
                updateCurrentFrameAndMoveToNextOne(frame, indexOfCurrentFrame, frame.getRolls()[0]);
            }
        } else {
            if ((frameFirstRoll + pins) <= NUMBER_OF_PINS_PER_FRAME) {
                frame.getRolls()[1] = pins;
                updateCurrentFrameAndMoveToNextOne(frame, indexOfCurrentFrame, frameFirstRoll);
            }

        }
    }

    private void updateCurrentFrameAndMoveToNextOne(Frame frame, int indexOfCurrentFrame, Integer roll) {
        frame.setFull(true);
        frame.setScore(roll + frame.getRolls()[1]);
        this.setScore(this.score() + frame.getScore());
        if ((indexOfCurrentFrame + 1) < FRAMES.size()) {
            this.frameViewModel = new FrameIndexViewModel(FRAMES.get(indexOfCurrentFrame + 1), indexOfCurrentFrame + 1);
        } else {
            this.setGameOver(true);
        }
    }

    private final class FrameIndexViewModel {
        private final Frame frame;
        private final int indexOfCurrentFrame;

        private FrameIndexViewModel(Frame frame, int indexOfFrame) {
            super();
            this.frame = frame;
            this.indexOfCurrentFrame = indexOfFrame;
        }
    }

}
