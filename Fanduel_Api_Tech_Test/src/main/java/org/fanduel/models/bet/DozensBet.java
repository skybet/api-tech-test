package org.fanduel.models.bet;

public class DozensBet extends Bet {
    public int firstNumber;

    public DozensBet() {
        super(2);
    }

    @Override
    public boolean doesWin(int numberSpinned) {
        if(numberSpinned == 37 || numberSpinned == 0)
            return false;
        if (firstNumber == 1 && numberSpinned >= 1 && numberSpinned <=12)
            return true;
        if (firstNumber == 13 && numberSpinned >= 13 && numberSpinned <=24)
            return true;
        if (firstNumber == 25 && numberSpinned >= 25 && numberSpinned <=36)
            return true;
        return false;
    }

    @Override
    public boolean validate() {
        return super.validate() && (firstNumber == 1 || firstNumber == 13 || firstNumber == 25);
    }
}
