package org.fanduel.models;

import java.util.Arrays;
import java.util.List;

public class RedBlackBet implements Bet {
    public boolean reds;

    private List<Integer> redNumbers = Arrays.asList(1,3,5,7, 9, 12, 14, 16, 18, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36);

    @Override
    public boolean doesWin(int numberSpinned) {
        if(numberSpinned == 37 || numberSpinned == 0)
            return false;
        if (reds && redNumbers.contains(numberSpinned))
            return true;
        if (!reds && !redNumbers.contains(numberSpinned))
            return true;
        return false;
    }
}
