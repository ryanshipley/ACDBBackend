package com.shipley.app.ac.Repo;

import com.shipley.app.ac.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Gamerepo extends JpaRepository<Game, Long> {
}
