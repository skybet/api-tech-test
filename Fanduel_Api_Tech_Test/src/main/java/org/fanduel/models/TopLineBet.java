package org.fanduel.models;

public class TopLineBet implements Bet {
    @Override
    public boolean doesWin(int numberSpinned) {
        if(numberSpinned == 37 || numberSpinned == 0)
            return true;
        return 1 <= numberSpinned && numberSpinned <= 3;
    }
}
