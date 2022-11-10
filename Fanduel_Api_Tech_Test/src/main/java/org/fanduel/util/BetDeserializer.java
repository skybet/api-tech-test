package org.fanduel.util;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.fanduel.models.StakeType;
import org.fanduel.models.bet.*;

import java.io.IOException;

public class BetDeserializer  extends JsonDeserializer<Bet> {


    @Override
    public Bet deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {

        ObjectMapper mapper = (ObjectMapper) p.getCodec();
        ObjectNode root = mapper.readTree(p);

        if (root.has("stakeType")) {
            return switch (StakeType.values()[root.get("stakeType").asInt()]) {

                case SINGLE -> mapper.readValue(root.toString(), SingleBet.class);
                case SPLIT -> mapper.readValue(root.toString(), SplitBet.class);
                case STREET -> mapper.readValue(root.toString(), StreetBet.class);
                case SQUARE -> mapper.readValue(root.toString(), SquareBet.class);
                case SIXLINE -> mapper.readValue(root.toString(), SixLineBet.class);
                case TOPLINE -> mapper.readValue(root.toString(), TopLineBet.class);
                case COLUMN -> mapper.readValue(root.toString(), ColumnBet.class);
                case DOZEN -> mapper.readValue(root.toString(), DozensBet.class);
                case ODDSEVENS -> mapper.readValue(root.toString(), OddsEvensBet.class);
                case REDBLACK -> mapper.readValue(root.toString(), RedBlackBet.class);
                case HALFNUMBER -> mapper.readValue(root.toString(), HalfNumberBet.class);
            };
        }
        throw new IOException("Failed to deserialize bet");
    }
}
