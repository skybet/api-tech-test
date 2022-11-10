package org.fanduel.models.bet;

public class ColumnBet extends Bet {
    public int bottomNumber;

    public ColumnBet() {
        super(2);
    }

    @Override
    public boolean doesWin(int numberSpinned) {
        if(numberSpinned == 37 || numberSpinned == 0)
            return false;
        int remainder = numberSpinned % 3;
        if(bottomNumber == 34 && remainder == 1)
            return true;
        if(bottomNumber == 35 && remainder == 2)
            return true;
        if(bottomNumber == 36 && remainder == 0)
            return true;
        return false;
    }

    @Override
    public boolean validate() {
        return super.validate() && (bottomNumber == 34 || bottomNumber == 35 || bottomNumber == 36);
    }
}
