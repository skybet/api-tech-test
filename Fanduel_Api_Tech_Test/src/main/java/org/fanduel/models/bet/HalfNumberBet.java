package org.fanduel.models.bet;

public class HalfNumberBet extends Bet {
    public boolean firstHalf;

    public HalfNumberBet() {
        super(1);
    }

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

    @Override
    public boolean validate() {
        return super.validate();
    }
}
