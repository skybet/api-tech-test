package org.fanduel.models.bet;

public class SquareBet implements Bet {
    public int topLeftNumber;

    @Override
    public boolean doesWin(int numberSpinned) {
        if (numberSpinned == 37 || numberSpinned == 0)
            return false;
        return numberSpinned == topLeftNumber || numberSpinned == topLeftNumber + 1 || numberSpinned == topLeftNumber + 3 || numberSpinned == topLeftNumber + 4;
    }

    @Override
    public boolean validate() {
        return topLeftNumber % 3 != 0 && 1 <= topLeftNumber && topLeftNumber <= 32;
    }
}
