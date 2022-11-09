package org.fanduel.models.bet;

public class SingleBet implements Bet {
    public int numberChosen;

    @Override
    public boolean doesWin(int numberSpinned) {
        return numberSpinned == numberChosen;
    }

    @Override
    public boolean validate() {
        return 0 <= numberChosen && numberChosen <= 37;
    }
}
