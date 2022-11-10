package org.fanduel.models.bet;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RedBlackBet extends Bet {
    public boolean a;

    private List<Integer> list = Arrays.asList(1,3,5,7, 9, 12, 14, 16, 18, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36);

    public RedBlackBet() {
        super(1);
//        list.add()
    }

    @Override
    public boolean doesWin(int b) {
        if(b == 37||b==0)
            return false;
        if (a && list.contains(b))
            return true;
        if (!a && !list.contains(b))
            return true;
        return false;
    }

    @Override
    public boolean validate() {
        return super.validate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        RedBlackBet that = (RedBlackBet) o;
        return a == that.a && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, list);
    }
}
