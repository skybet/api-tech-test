package org.fanduel.models;

import org.fanduel.models.bet.*;

public class Stake {
    public StakeType stakeType;
    public SingleBet singleNumberBet;
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

    public boolean validate() {
        return switch (stakeType) {

            case SINGLE -> singleNumberBet != null && singleNumberBet.validate();
            case SPLIT -> splitBet != null && splitBet.validate();
            case STREET -> streetBet != null && streetBet.validate();
            case SQUARE -> squareBet != null && squareBet.validate();
            case SIXLINE -> sixLineBet != null && sixLineBet.validate();
            case TOPLINE -> topLineBet != null && topLineBet.validate();
            case COLUMN -> columnBet != null && columnBet.validate();
            case DOZEN -> dozensBet != null && dozensBet.validate();
            case ODDSEVENS -> oddsEvensBet != null && oddsEvensBet.validate();
            case REDBLACK -> redBlackBet != null && redBlackBet.validate();
            case HALFNUMBER -> halfNumberBet != null && halfNumberBet.validate();
        };

    }
}
