package org.fanduel.models.bet;

public class OddsEvensBet extends Bet {
    public boolean odds;

    public OddsEvensBet() {
        super(1);
    }

    @Override
    public boolean doesWin(int numberSpinned) {
        if(numberSpinned == 37 || numberSpinned == 0)
            return false;
        int remainder = numberSpinned % 2;
        if(odds && remainder == 1)
            return true;
        if(!odds && remainder == 0)
            return true;
        return false;
    }

    @Override
    public boolean validate() {
        return super.validate();
    }
}
