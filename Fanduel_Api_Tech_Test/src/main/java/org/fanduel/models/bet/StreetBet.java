package org.fanduel.models.bet;

public class StreetBet implements Bet {
    public int lastRowNumber;

    @Override
    public boolean doesWin(int numberSpinned) {
        if(numberSpinned == 37 || numberSpinned == 0)
            return false;
        return (lastRowNumber-3) <= numberSpinned && numberSpinned <= lastRowNumber;
    }

    @Override
    public boolean validate() {
        return lastRowNumber % 3 == 0 && 1 <= lastRowNumber && lastRowNumber <= 36;
    }
}
