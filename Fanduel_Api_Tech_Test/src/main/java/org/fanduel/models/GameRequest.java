package org.fanduel.models;

import java.util.List;

public class GameRequest {
    public List<Stake> stakes;

    public GameRequest() {}

    public GameRequest(List<Stake> stakes) {
        this.stakes = stakes;
    }

    public List<Stake> getStakes() {
        return stakes;
    }

    public boolean validate() {
        for (Stake stake : stakes) {
            if(!stake.validate())
                return false;
        }
        return true;
    }
}
