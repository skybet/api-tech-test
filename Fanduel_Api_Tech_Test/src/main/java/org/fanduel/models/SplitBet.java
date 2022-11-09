package org.fanduel.models;

public class SplitBet implements Bet {
    public int firstNumber;
    public int secondNumber;

    @Override
    public boolean doesWin(int numberSpinned) {
        return numberSpinned == firstNumber || numberSpinned == secondNumber;
    }
}
