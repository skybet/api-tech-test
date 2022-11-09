package org.fanduel.models;

public class SixLineBet implements Bet {
    public int topLineNumber;

    @Override
    public boolean doesWin(int numberSpinned) {
        if(numberSpinned == 37 || numberSpinned == 0)
            return false;
        return topLineNumber-2 <= numberSpinned && numberSpinned <= topLineNumber+3;
    }
}
