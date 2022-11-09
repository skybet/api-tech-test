package org.fanduel.models.bet;

public interface Bet {
    public boolean doesWin(int numberSpinned);

    public boolean validate();
}
