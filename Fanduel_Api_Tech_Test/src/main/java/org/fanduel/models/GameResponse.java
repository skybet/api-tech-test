package org.fanduel.models;

import java.math.BigDecimal;

public class GameResponse {
    private final BigDecimal amountWon;
    private final int spinNumber;


    public GameResponse(BigDecimal amountWon, int spinNumber) {
        this.amountWon = amountWon;
        this.spinNumber = spinNumber;
    }
}
