package org.fanduel.models.bet;

public class SquareBet extends Bet {
    public int topLeftNumber;

    public SquareBet() {
        super(8);
    }

    @Override
    public boolean doesWin(int numberSpinned) {
        if (numberSpinned == 37 || numberSpinned == 0)
            return false;
        return numberSpinned == topLeftNumber || numberSpinned == topLeftNumber + 1 || numberSpinned == topLeftNumber + 3 || numberSpinned == topLeftNumber + 4;
    }

    @Override
    public boolean validate() {
        return super.validate() && topLeftNumber % 3 != 0 && 1 <= topLeftNumber && topLeftNumber <= 32;
    }
}
