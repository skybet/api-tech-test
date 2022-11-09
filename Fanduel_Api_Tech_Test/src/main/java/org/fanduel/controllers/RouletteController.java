package org.fanduel.controllers;

import org.fanduel.models.GameRequest;
import org.fanduel.models.GameResponse;
import org.fanduel.services.RouletteEngine;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roulette/api/v1")
public class RouletteController {

    private final RouletteEngine rouletteEngine;

    public RouletteController(RouletteEngine rouletteEngine) {
        this.rouletteEngine = rouletteEngine;
    }

    @GetMapping(path = "stake")
    public GameResponse playGame (@RequestBody GameRequest gameRequest) {
        return rouletteEngine.playGame(gameRequest);
    }
}
