package org.fanduel.models.bet;

public class OddsEvensBet implements Bet {
    public boolean odds;

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
        return true;
    }
}
