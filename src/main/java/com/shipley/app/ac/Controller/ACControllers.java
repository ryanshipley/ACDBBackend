package com.shipley.app.ac.Controller;

import com.shipley.app.ac.Repo.Gamerepo;
import com.shipley.app.ac.models.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ACControllers {

    @Autowired
    private Gamerepo gameRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }
@GetMapping(value = "/games")
    public List<Game> getGames(){
        return gameRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveGame(@RequestBody Game game){
        gameRepo.save(game);
        return "Saved....";
    }
}
