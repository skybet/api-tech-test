package org.fanduel.services;

import org.fanduel.models.bet.Bet;
import org.fanduel.models.GameRequest;
import org.fanduel.models.GameResponse;
import org.fanduel.models.Stake;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class DefaultRouletteEngine implements RouletteEngine {

    public DefaultRouletteEngine() { }

    @Override
    public GameResponse playGame(GameRequest gameRequest, Integer forcedSpinNumber) {
        int numberSpinned;
        if (forcedSpinNumber != null )
            numberSpinned = forcedSpinNumber;
        else
            numberSpinned = rouletteSpin();

        return new GameResponse(calculateAmountWon(gameRequest.getStakes(), numberSpinned), numberSpinned);
    }

    public BigDecimal calculateAmountWon(List<Stake> stakes, int spinNumber) {
        BigDecimal amount = BigDecimal.ZERO;
        for (Stake stake: stakes) {
            amount = amount.add(switch (stake.stakeType)
            {
                case SINGLE -> stakeWin(stake.singleNumberBet, spinNumber);
                case SPLIT -> stakeWin(stake.splitBet, spinNumber);
                case STREET -> stakeWin(stake.streetBet, spinNumber);
                case SQUARE -> stakeWin(stake.squareBet, spinNumber);
                case SIXLINE -> stakeWin(stake.sixLineBet, spinNumber);
                case TOPLINE -> stakeWin(stake.topLineBet, spinNumber);
                case COLUMN -> stakeWin(stake.columnBet, spinNumber);
                case DOZEN -> stakeWin(stake.dozensBet, spinNumber);
                case ODDSEVENS -> stakeWin(stake.oddsEvensBet, spinNumber);
                case REDBLACK -> stakeWin(stake.redBlackBet, spinNumber);
                case HALFNUMBER -> stakeWin(stake.halfNumberBet, spinNumber);
            });
        }
        return amount;
    }

    public BigDecimal stakeWin(Bet bet, int spinNumber) {
        return bet.doesWin(spinNumber) ? bet.amount.multiply(new BigDecimal(bet.getOdds())).add(bet.amount) : BigDecimal.ZERO;
    }

    public int rouletteSpin() {
        return ThreadLocalRandom.current().nextInt(0, 37 + 1);
    }
}
