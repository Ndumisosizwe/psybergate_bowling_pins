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

}
