package com.juancarlos.dslist.repository;

import com.juancarlos.dslist.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Games, Long> {
}
