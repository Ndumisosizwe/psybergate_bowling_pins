package com.psybergate.bowling.game.impl;

import com.psybergate.bowling.game.base.AbstractGame;

public class BowlingGame001 extends AbstractGame {

    public void roll(int pins) {
        if ((this.score() + pins) < 10)
            this.totalScore = pins;
    }

}
