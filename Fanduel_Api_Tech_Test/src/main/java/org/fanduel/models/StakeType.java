package org.fanduel.models;

import java.math.BigDecimal;

public enum StakeType {
    SINGLE(35),
    SPLIT(17),
    STREET(11),
    SQUARE(8),
    SIXLINE(5),
    TOPLINE(6),
    COLUMN(2),
    DOZEN(2),
    ODDSEVENS(1),
    REDBLACK(1),
    HALFNUMBER(1);

    public int odds;

    StakeType(int odds) {
        this.odds = odds;
    }
}
