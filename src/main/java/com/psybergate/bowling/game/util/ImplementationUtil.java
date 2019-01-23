package com.psybergate.bowling.game.util;

import com.psybergate.bowling.game.base.Game;
import com.psybergate.bowling.game.impl.BowlingGame002;

/**
 * @author Ndumi
 * @since 24-Jan-19
 */
public class ImplementationUtil {

    public static Game getInstance() {
        return new BowlingGame002();
    }
}
