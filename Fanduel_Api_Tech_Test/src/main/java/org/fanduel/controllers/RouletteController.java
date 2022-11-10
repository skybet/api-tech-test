package org.fanduel.controllers;

import org.fanduel.models.GameRequest;
import org.fanduel.models.GameResponse;
import org.fanduel.services.RouletteEngine;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/roulette/api/v1")
public class RouletteController {

    private final RouletteEngine rouletteEngine;

    public RouletteController(RouletteEngine rouletteEngine) {
        this.rouletteEngine = rouletteEngine;
    }

    @PostMapping(path = "play")
    public GameResponse playGame (@RequestBody GameRequest gameRequest, @RequestParam Optional<Integer> forcedSpinNumber) {

        if(!gameRequest.validate())
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Game Request malformed");

        if(forcedSpinNumber.isPresent() && (forcedSpinNumber.get() < 0 || forcedSpinNumber.get() > 37))
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Forced spin number must be between 0 -37");

        return rouletteEngine.playGame(gameRequest, forcedSpinNumber.orElse(null));
    }
}
