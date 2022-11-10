package org.fanduel.models.bet;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = SingleBet.class)
public class SingleBet extends Bet {
    public int numberChosen;

    SingleBet() {
        super(35);
    }

    @Override
    public boolean doesWin(int numberSpinned) {
        return numberSpinned == numberChosen;
    }

    @Override
    public boolean validate() {
        return super.validate() && 0 <= numberChosen && numberChosen <= 37;
    }
}
