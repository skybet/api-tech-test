package org.fanduel.services;

import org.fanduel.models.GameRequest;
import org.fanduel.models.GameResponse;

public interface RouletteEngine {
    GameResponse playGame(GameRequest gameRequest, Integer forcedSpinNumber);
}
