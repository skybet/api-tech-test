package org.fanduel.models.bet;

import java.math.BigDecimal;

public abstract class Bet {
    
    public Integer odds = null;
    public BigDecimal amount = null;

    public Bet(Integer odds) {
        this.odds = odds;
    }

    public Integer getOdds() {
        return odds;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public abstract boolean doesWin(int numberSpinned);

    public boolean validate() {
        if(amount == null && amount.longValue() <= 0)
            return false;
        return true;
    }
}
