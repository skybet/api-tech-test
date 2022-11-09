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
    public GameResponse playGame(GameRequest gameRequest) {
        int numberSpinned = rouletteSpin();
        return new GameResponse(calculateAmountWon(gameRequest.getStakes(), numberSpinned), numberSpinned);
    }

    public BigDecimal calculateAmountWon(List<Stake> stakes, int spinNumber) {
        BigDecimal amount = BigDecimal.ZERO;
        for (Stake stake: stakes) {
            amount = amount.add(switch (stake.stakeType)
            {
                case SINGLE -> stakeWin(stake.singleNumber, stake.amount, stake.stakeType.odds, spinNumber);
                case SPLIT -> stakeWin(stake.splitBet, stake.amount, stake.stakeType.odds, spinNumber);
                case STREET -> stakeWin(stake.streetBet, stake.amount, stake.stakeType.odds, spinNumber);
                case SQUARE -> stakeWin(stake.squareBet, stake.amount, stake.stakeType.odds, spinNumber);
                case SIXLINE -> stakeWin(stake.sixLineBet, stake.amount, stake.stakeType.odds, spinNumber);
                case TOPLINE -> stakeWin(stake.topLineBet, stake.amount, stake.stakeType.odds, spinNumber);
                case COLUMN -> stakeWin(stake.columnBet, stake.amount, stake.stakeType.odds, spinNumber);
                case DOZEN -> stakeWin(stake.dozensBet, stake.amount, stake.stakeType.odds, spinNumber);
                case ODDSEVENS -> stakeWin(stake.oddsEvensBet, stake.amount, stake.stakeType.odds, spinNumber);
                case REDBLACK -> stakeWin(stake.redBlackBet, stake.amount, stake.stakeType.odds, spinNumber);
                case HALFNUMBER -> stakeWin(stake.halfNumberBet, stake.amount, stake.stakeType.odds, spinNumber);
            });
        }
        return amount;
    }

    public BigDecimal stakeWin(Bet bet, BigDecimal amount, int odds, int spinNumber) {
        return bet.doesWin(spinNumber) ? amount.multiply(new BigDecimal(odds)).add(amount) : BigDecimal.ZERO;
    }

    public int rouletteSpin() {
        return ThreadLocalRandom.current().nextInt(0, 37 + 1);
    }
}
