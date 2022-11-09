package org.fanduel.models.bet;

public class SplitBet implements Bet {
    public int firstNumber;
    public int secondNumber;

    @Override
    public boolean doesWin(int numberSpinned) {
        return numberSpinned == firstNumber || numberSpinned == secondNumber;
    }

    @Override
    public boolean validate() {
        return 1 <= firstNumber && firstNumber <= 37 && 1 <= secondNumber && secondNumber <= 37;
    }
}
