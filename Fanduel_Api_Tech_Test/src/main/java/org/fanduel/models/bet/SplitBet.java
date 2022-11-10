package org.fanduel.models.bet;

public class SplitBet extends Bet {
    public int firstNumber;
    public int secondNumber;

    public SplitBet() {
        super(17);
    }

    @Override
    public boolean doesWin(int numberSpinned) {
        return numberSpinned == firstNumber || numberSpinned == secondNumber;
    }

    @Override
    public boolean validate() {
        return super.validate() && 1 <= firstNumber && firstNumber <= 37 && 1 <= secondNumber && secondNumber <= 37;
    }
}
