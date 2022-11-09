package org.fanduel.models;

public class SingleBet implements Bet {
    public int numberChosen;

    @Override
    public boolean doesWin(int numberSpinned) {
        return numberSpinned == numberChosen;
    }
}
