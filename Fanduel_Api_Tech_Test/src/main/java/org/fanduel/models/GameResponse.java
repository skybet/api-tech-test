package org.fanduel.models;

import java.math.BigDecimal;

public class GameResponse {
    public BigDecimal amountWon;
    public int spinNumber;

    public BigDecimal getAmountWon() {
        return amountWon;
    }

    public int getSpinNumber() {
        return spinNumber;
    }

    public GameResponse() {}

    public GameResponse(BigDecimal amountWon, int spinNumber) {
        this.amountWon = amountWon;
        this.spinNumber = spinNumber;
    }
}
