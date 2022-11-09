package org.fanduel.models;

public class SquareBet implements Bet {
    public int topLeftNumber;

    @Override
    public boolean doesWin(int numberSpinned) {
        if (numberSpinned == 37 || numberSpinned == 0)
            return false;
        return numberSpinned == topLeftNumber || numberSpinned == topLeftNumber + 1 || numberSpinned == topLeftNumber + 3 || numberSpinned == topLeftNumber + 4;
    }
}
