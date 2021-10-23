package com.szorgalmi.kozmondas.Controllers;

import com.szorgalmi.kozmondas.Entity.Proverb;
import com.szorgalmi.kozmondas.Services.GameService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService){
        this.gameService = gameService;
    }

    @GetMapping(path = "/{maxStudentNumber}")
    public String generatePlay(@PathVariable("maxStudentNumber") int maxStudentNumber) throws SQLException, ClassNotFoundException {
        return gameService.generatePlay(maxStudentNumber);
    }
}
