package org.fanduel.models;

import java.math.BigDecimal;

public class Stake {
    public BigDecimal amount;
    public StakeType stakeType;
    public SingleBet singleNumber;
    public SplitBet splitBet;
    public StreetBet streetBet;
    public SquareBet squareBet;
    public SixLineBet sixLineBet;
    public TopLineBet topLineBet;
    public ColumnBet columnBet;
    public DozensBet dozensBet;
    public OddsEvensBet oddsEvensBet;
    public RedBlackBet redBlackBet;
    public HalfNumberBet halfNumberBet;
}
