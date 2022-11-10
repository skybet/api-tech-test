package org.fanduel;

import org.fanduel.models.GameRequest;
import org.fanduel.models.GameResponse;
import org.fanduel.models.Stake;
import org.fanduel.models.StakeType;
import org.fanduel.models.bet.SingleBet;
import org.fanduel.services.DefaultRouletteEngine;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest()
public class RouletteTests {

//    @Autowired
//    private MockMvc mvc;

//    @Autowired
//    private TestRestTemplate template;
//
//    @Autowired
//    private DefaultRouletteEngine engine;
//
//    @Test
//    public void test_roulettePlayEndpoint() throws Exception {
//
//        GameRequest gameRequest = new GameRequest();
//
//        Stake stake = new Stake();
//        stake.stakeType = StakeType.SINGLE;
//        stake.singleNumber = new SingleBet();
//        stake.singleNumber.numberChosen = 5;
//        stake.amount = new BigDecimal(20);
//
//        gameRequest.stakes = Arrays.asList(stake);
//
//        Mockito.when(engine.rouletteSpin()).thenReturn(5);
//
////        when(engine.rouletteSpin()).thenReturn(5);
//
//        ResponseEntity<GameResponse> response = template.postForEntity("/roulette/api/v1/play", gameRequest, GameResponse.class);
//        assertNotNull(response);
//        assertEquals(720, response.getBody().getAmountWon().longValue());
//
////        mvc.perform(MockMvcRequestBuilders.post("/roulette/api/v1/play", gameRequest).accept(MediaType.APPLICATION_JSON))
////                .andExpect(status().isOk());
//    }
}
