package org.fanduel.models.bet;

public class SixLineBet extends Bet {
    public int topLineNumber;

    public SixLineBet() {
        super(5);
    }

    @Override
    public boolean doesWin(int numberSpinned) {
        if(numberSpinned == 37 || numberSpinned == 0)
            return false;
        return topLineNumber-2 <= numberSpinned && numberSpinned <= topLineNumber+3;
    }

    @Override
    public boolean validate() {
        return super.validate() && 3 <= topLineNumber && topLineNumber <= 33 && topLineNumber % 3 == 0;
    }
}
