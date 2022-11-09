package org.fanduel.models;

public class HalfNumberBet implements Bet {
    public boolean firstHalf;

    @Override
    public boolean doesWin(int numberSpinned) {
        if(numberSpinned == 37 || numberSpinned == 0)
            return false;
        if( firstHalf && numberSpinned <=18)
            return true;
        if( !firstHalf && numberSpinned >=19)
            return true;
        return false;
    }
}
